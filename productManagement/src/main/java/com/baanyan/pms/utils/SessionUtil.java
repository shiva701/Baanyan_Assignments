package com.baanyan.pms.utils;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.baanyan.pms.model.Product;

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
		return new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory().openSession();
		
	}
}
