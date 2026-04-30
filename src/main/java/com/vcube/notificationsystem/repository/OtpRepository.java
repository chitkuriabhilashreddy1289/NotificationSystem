package com.vcube.notificationsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.notificationsystem.model.Otp;
import com.vcube.notificationsystem.model.User;

public interface OtpRepository extends JpaRepository<Otp, Long> {
    Optional<Otp> findByUser(User user);
    
    Optional<Otp> findByUserAndOtp(User user, String otp);
}