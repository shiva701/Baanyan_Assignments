package com.baanyan.ums.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baanyan.ums.customException.InvalidUserException;
import com.baanyan.ums.dao.UserDao;
import com.baanyan.ums.model.User;
import com.baanyan.ums.model.utils.SessionUtil;

import jakarta.persistence.NoResultException;

/**
 * The Class UserDaoImpl.
 */
public class UserDaoImpl implements UserDao {

	/** The log. */
	private static Logger log = LoggerFactory.getLogger(UserDaoImpl.class);

	/** The session. */
	static Session session = null;

	/** The tran. */
	static Transaction tran = null;

	/**
	 * Login.
	 *
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 */
	@SuppressWarnings("deprecation")
	@Override
	public boolean login(String username, String password) {
		try {
			session = SessionUtil.getSession();
			@SuppressWarnings("rawtypes")
			NativeQuery query = session.createNativeQuery("select username, password from User where username=:uname");
			query.setParameter("uname", username);
			query.addScalar("username");
			query.addScalar("password");
			List<Object[]> result = query.getResultList();
			if (result.size() > 0 && result.get(0)[1].equals(password)) {
				return true;
			} else {
				throw new InvalidUserException("User Details are invalid!!");
			}
		} catch (InvalidUserException e) {
			log.error(">>>>>> Exception at login: " + e);
		} catch (NoResultException e) {
			log.error(">>>>>> Exception at login, User not found");
		} catch (Exception e) {
			log.error(">>>>>> Exception at login: " + e);
		} finally {
			session.close();
		}
		return false;
	}

	/**
	 * Register user.
	 *
	 * @param user the user
	 */
	@Override
	public int registerUser(User user) {
		int cnt = 0;
		try {
			session = SessionUtil.getSession();
			tran = session.beginTransaction();
			MutationQuery query = session.createMutationQuery(
					"insert User(firstName, lastName, username, password) values(:fname, :lname, :uname, :pwd)");
			query.setParameter("fname", user.getFirstName());
			query.setParameter("lname", user.getLastName());
			query.setParameter("uname", user.getUsername());
			query.setParameter("pwd", user.getPassword());
			cnt = query.executeUpdate();
			tran.commit();
			if (cnt != 1) {
				throw new Exception("cannot register the user");
			}
		} catch (Exception e) {
			tran.rollback();
			log.error(">>>>>> Exception at register user: " + e);
		} finally {
			session.close();
		}
		return cnt;
	}

	/**
	 * Forgot password.
	 *
	 * @param username the username
	 * @param pwd      the pwd
	 * @return true, if successful
	 */
	@Override
	public boolean forgotPassword(String username, String pwd) {
		try {
			session = SessionUtil.getSession();
			tran = session.beginTransaction();
			NativeQuery query = session.createNativeQuery("select username from User where username=:uname");
			query.setParameter("uname", username);
			query.addScalar("username");
			Object result = query.getSingleResultOrNull();
			if (result == null) {
				throw new InvalidUserException("User does not exist!!");
			} else {
				MutationQuery queryUpdate = session.createMutationQuery("update User set password=:pass");
				queryUpdate.setParameter("pass", pwd);
				int cnt = queryUpdate.executeUpdate();
				if (cnt != 1) {
					throw new Exception("Cannot update the password, please check again");
				} else {
					return true;
				}
			}
		} catch (InvalidUserException e) {
			log.error("\n\n>>>>>>Exception at forgot password: " + e);
		} catch (Exception e) {
			tran.rollback();
			log.error(">>>>> Exception at forgot password: " + e);
		} finally {
			session.close();
		}
		return false;
	}

}
