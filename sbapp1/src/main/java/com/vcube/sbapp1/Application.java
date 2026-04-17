package com.vcube.sbapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vcube.sbapp1.controller.HelloController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Student s1 = context.getBean(Student.class);
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
	}

}
