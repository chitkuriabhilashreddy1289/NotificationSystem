package com.vcube.springapp6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.vcube.springapp6.model.Details;
import com.vcube.springapp6.repository.DetailsRepository;
@Service
public class DetailsSevice {
	@Autowired
	DetailsRepository dr;
	
	public Details insertdetails(Details d) {
		return dr.save(d);
	}
	
	public List<Details> getDetails() {
		return dr.findAll();
	}
	
	public Details updateDetails(Details d,Integer id) {
		Details db=dr.findById(id).orElseThrow();
		db.setLocation(d.getLocation());
		db.setName(d.getName());
		return dr.save(db);
	}

}
