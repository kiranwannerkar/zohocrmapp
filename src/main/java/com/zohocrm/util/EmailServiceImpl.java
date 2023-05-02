package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender; // its an interface springboot automatically inject obj address into it
// to click on send email  we have to use javaMailSender important
	@Override
	public void sendSimpleMail(String to, String sub, String emailBody) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);// this will set to address
		mailMessage.setSubject(sub);
		mailMessage.setText(emailBody);
		
		javaMailSender.send(mailMessage);
	}

}
