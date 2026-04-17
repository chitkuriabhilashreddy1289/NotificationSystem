package com.vcube.springapp6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.springapp6.model.Details;
import com.vcube.springapp6.service.DetailsSevice;

@RestController

public class DetailsController {
	@Autowired
	DetailsSevice service;

	@PostMapping("/insert")
	public Details adddetails(@RequestBody Details d) {
		return service.insertdetails(d);
	}
     @GetMapping("/getdetails")
	public List<Details> getDetails() {
		return service.getDetails();
	}
     @PutMapping("/changedetails")
   public Details changeDetails(@PathVariable("id") Integer id,@RequestBody Details d) {
    	 return service.updateDetails(d,id);
    			 
     }
}
