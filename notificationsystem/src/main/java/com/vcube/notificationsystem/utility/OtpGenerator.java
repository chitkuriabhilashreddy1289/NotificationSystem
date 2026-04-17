package com.vcube.notificationsystem.utility;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class OtpGenerator {
	public String generateOtp() {
		String otp = String.valueOf(new Random().nextInt(900000) + 100000);
		return otp;
	}
}
