package com.baanyan.ums.customException;

/**
 * The Class InvalidUserException.
 */
public class InvalidUserException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new invalid user exception.
	 *
	 * @param msg the msg
	 */
	public InvalidUserException(String msg) {
		super(msg);
	}

}
