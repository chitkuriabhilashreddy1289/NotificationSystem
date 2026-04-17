package com.vcube.sbapp1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	String hello() {
		return "welcome to spring boot";
		
	}
	}


