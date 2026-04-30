package com.vcube.notificationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.notificationsystem.service.EmailService;
import com.vcube.notificationsystem.service.OtpService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private OtpService otpService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-otp")
    public String sendOtp(@RequestParam String email) {

        String otp = otpService.generateOtp(email);

        emailService.sendEmail(email, "OTP Verification", "Your OTP is: " + otp);

        return "OTP sent successfully";
    }
    @PostMapping("/verify-otp")
    public String verifyOtp(@RequestParam String email,
                            @RequestParam String otp) {

        boolean result = otpService.verifyOtp(email, otp);

        return result ? "OTP Verified ✅" : "Invalid OTP ❌";
    }
}
