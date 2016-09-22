package com.juice.orange.account.email;

public interface AccountEmailService {
	public abstract void sendMail(String to, String subject, String htmlText)
			throws AccountEmailException;
}
