package com.zohocrm.util;

public interface EmailService {
	public void sendSimpleMail(String to, String sub, String emailBody);// String to==> to whom to send email
	// String sub==> subject of email ,String emailBody ==> body of email -email
	// message)
}
