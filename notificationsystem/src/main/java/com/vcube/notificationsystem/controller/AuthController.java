package com.vcube.notificationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vcube.notificationsystem.service.EmailService;
import com.vcube.notificationsystem.service.OtpService;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private OtpService otpService;

    @Autowired
    private EmailService emailService;

    // Load page
    @GetMapping("/otp-page")
    public String loadPage() {
        return "otp";
    }

    // Send OTP (UI)
    @PostMapping("/send-otp-ui")
    public String sendOtp(@RequestParam String email, Model model) {

		String otp = otpService.generateOtp(email);

        emailService.sendEmail(email, "OTP Verification", "Your OTP is: " + otp);

        model.addAttribute("message", "OTP sent successfully ✅");

        return "otp";
    }

    // Verify OTP (UI)
    @PostMapping("/verify-otp-ui")
    public String verifyOtp(@RequestParam String email,
                            @RequestParam String otp,
                            Model model) {

        boolean result = otpService.verifyOtp(email, otp);

        if (result) {
            model.addAttribute("message", "OTP Verified Successfully ✅");
        } else {
            model.addAttribute("message", "Invalid OTP ❌");
        }

        return "otp";
    }
}