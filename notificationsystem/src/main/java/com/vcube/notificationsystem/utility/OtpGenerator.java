package com.vcube.notificationsystem.utility;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class OtpGenerator {
    public String generateOtp() {
        return String.valueOf(new Random().nextInt(900000) + 100000);
    }
}
