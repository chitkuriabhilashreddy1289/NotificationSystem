package com.vcube.sbapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vcube.sbapp1.service.HelloService;

@Controller
public class MailController {
	@Autowired
	HelloService helloservice;

	@GetMapping("/send")
	@ResponseBody
	public String sendMail() {
		helloservice.sendEmail("abhilashcm85@gmail.com", "jobsearch", "you have shortlisted");

		return "mail-success";
	}

}
