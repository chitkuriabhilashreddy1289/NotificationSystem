package com.vcube.sbapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.sbapp2.model.Bike;

@RestController
public class BikeController {
	//rest end-point :http://localhost:8080/bike
	@GetMapping("/bike")
	Bike getBikeInfo() {
		
		Bike b=new Bike("classic","RE",200000.0,"black");
		return b;
		
	}

}
