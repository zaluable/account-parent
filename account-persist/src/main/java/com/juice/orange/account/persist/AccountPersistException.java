package com.juice.orange.account.persist;

public class AccountPersistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AccountPersistException(String msg){
		super(msg);
	}
	public AccountPersistException(String msg, Throwable cause){
		super(msg, cause);
	}

}
