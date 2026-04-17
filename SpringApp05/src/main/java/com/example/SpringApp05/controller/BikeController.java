package com.example.SpringApp05.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringApp05.model.Bike;
import com.example.SpringApp05.repository.BikeRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BikeController {


	@Autowired
	BikeRepository br;
	
	@PostMapping("/insertbike")
	Bike insertBikeInfo(@RequestBody Bike b){
		return br.save(b);
	}
	@GetMapping("getbikeinfo")
	List<Bike> getBikeInfo() {
		return br.findAll();
	}
	
	//http://localhost:9595/updatebyid/2
	@PutMapping("updatebyid/{id}")
	Bike updateBikeById(@RequestBody Bike b ,@PathVariable("id") Integer id) {
		Bike bdb=br.findById(id).orElseThrow();
		
		bdb.setBrand(b.getBrand());
		bdb.setModel(b.getModel());
		bdb.setPrice(b.getPrice());
		bdb.setColour(b.getColour());
		return br.save(bdb);
		
	}
	//http://localhost:9595/update/id
	@PatchMapping("update/{id}")
	Bike updateAcoloum(@RequestBody Bike b,@PathVariable("id") Integer id) {
		Bike db=br.findById(id).orElseThrow();
		db.setColour(b.getColour());
		return br.save(db);
	}
	//http://localhost:9595/deleteid/
	 @DeleteMapping("deleteid/{id}")
	    String deleteBikeInfoById(@PathVariable("id") Integer id) {
		 
		 br.deleteById(id);
			return "Deleted vehicle based on Id:"+id;
	    	
	    }
	 //http://localhost:9595/model/md/
	 @GetMapping("model/md/{model}")
	 Bike findByModel(@PathVariable("model") String model) {
		 
		 return br.findByModel(model).orElseThrow();
	 }
	
	

}
