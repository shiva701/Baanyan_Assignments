package com.baanyan.ums.model.utils;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.baanyan.ums.model.User;

/**
 * The Class SessionUtil.
 */
public class SessionUtil {

	/**
	 * Gets the session.
	 *
	 * @return the session
	 */
	public static Session getSession() {
		return new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory().openSession();

	}
}
