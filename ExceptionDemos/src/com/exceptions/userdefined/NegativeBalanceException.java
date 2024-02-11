package com.exceptions.userdefined;

public class NegativeBalanceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeBalanceException() {
		super();
	}

	public NegativeBalanceException(String message) {
		super(message);
	}

}
