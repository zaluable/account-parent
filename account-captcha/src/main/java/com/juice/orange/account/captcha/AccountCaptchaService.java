package com.juice.orange.account.captcha;

import java.util.List;

public interface AccountCaptchaService {
	String generateCaptchaKey()
			throws AccountCaptchaException;
	
	byte[] generateCaptchaImage(String Captcha)
			throws AccountCaptchaException;
	
	boolean validateCaptcha(String captchaKey, String captchaValue)
			throws AccountCaptchaException;
	
	List<String> getPreDefinedText();
	
	void setPreDefinedTexts(List<String> preDefinedTexts);
}
