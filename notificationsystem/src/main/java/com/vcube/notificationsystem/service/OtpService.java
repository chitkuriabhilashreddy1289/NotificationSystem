 package com.vcube.notificationsystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.notificationsystem.model.Otp;
import com.vcube.notificationsystem.model.User;
import com.vcube.notificationsystem.repository.OtpRepository;
import com.vcube.notificationsystem.repository.UserRepository;
import com.vcube.notificationsystem.utility.OtpGenerator;

@Service
public class OtpService {

    @Autowired
    private OtpRepository otpRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private OtpGenerator otpGenerator;

    public String generateOtp(String email) {

        User user = userRepo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        String otpValue = otpGenerator.generateOtp();

        Otp otp = new Otp();
        otp.setOtp(otpValue);
        otp.setUser(user);
        otp.setExpiryTime(LocalDateTime.now().plusMinutes(5));

        otpRepo.save(otp);

        return otpValue;
    }
    public boolean verifyOtp(String email, String otpValue) {

        User user = userRepo.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Otp otp = otpRepo.findByUserAndOtp(user, otpValue)
                .orElseThrow(() -> new RuntimeException("Invalid OTP"));

         

        otpRepo.delete(otp);

        return true;
    }
}
