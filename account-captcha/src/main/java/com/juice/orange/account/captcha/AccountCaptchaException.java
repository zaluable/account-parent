package com.juice.orange.account.captcha;

public class AccountCaptchaException extends Exception {

	private static final long serialVersionUID = -7266436317556296981L;

	public AccountCaptchaException(String message) {
		super(message);
	}

	public AccountCaptchaException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
