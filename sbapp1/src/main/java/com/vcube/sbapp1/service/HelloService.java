package com.vcube.sbapp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Autowired
	private JavaMailSender mailsender;

	public void sendEmail(String to, String subject, String body) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(to);
		message.setSubject(subject);
		message.setText(body);
		message.setFrom("abhilashreddyc88@gmail.com");

		mailsender.send(message);

	}

}
