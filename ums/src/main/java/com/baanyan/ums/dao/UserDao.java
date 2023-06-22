package com.baanyan.ums.dao;

import com.baanyan.ums.model.User;

/**
 * The Interface UserDao.
 */
public interface UserDao {

	/**
	 * Login.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @return true, if successful
	 */
	boolean login(String userName, String password);

	/**
	 * Register user.
	 *
	 * @param user the user
	 * @return the int
	 */
	int registerUser(User user);

	/**
	 * Forgot password.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	boolean forgotPassword(String username, String password);
}
