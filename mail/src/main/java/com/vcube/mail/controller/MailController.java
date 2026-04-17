package com.vcube.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.mail.service.EmailService;

@RestController
public class MailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-mail")
    public String sendMail() {
        emailService.sendEmail(
            "abhilashcm85@gmail.com",
            "Test Mail",
            "Hello from Spring Boot!"
        );
        return "Mail Sent Successfully!";
    }
}