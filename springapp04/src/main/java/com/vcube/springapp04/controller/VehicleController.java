package com.vcube.springapp04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.springapp04.model.Vehicle;
import com.vcube.springapp04.repository.VehicleRepository;

@RestController
public class VehicleController {

	@Autowired
	VehicleRepository vr;

	// http://localhost:9595/insertve
	@PostMapping("insertve")
	Vehicle vehicleInfo(@RequestBody Vehicle v) {
		return vr.save(v);}
	
		// http://localhost:9595/getvehicle
	
	@GetMapping("getAllvehicles")
	List<Vehicle> getVehicles() {
		return vr.findAll();
	}
	// http://localhost:9595/getVehicleById
	@GetMapping("getVehicleById/{id}")
	Vehicle getVehicleById(@PathVariable("id") Integer id) {
		return vr.findById(id).orElseThrow();
	}
	// http://localhost:9595/update
	@PutMapping("update/{id}")
	Vehicle updateVehicleInfo(@RequestBody Vehicle v, @PathVariable("id") Integer id) {
		Vehicle veh = vr.findById(id).orElseThrow();
		veh.setBrand(v.getBrand());
		veh.setModel(v.getModel());
		veh.setPrice(v.getPrice());
		veh.setVehicleno(v.getVehicleno());
		return vr.save(veh);
	}
	// http://localhost:9595/updatecoloum
	@PatchMapping("updatecoloum/{id}")
	Vehicle updatecoloumInfo(@RequestBody Vehicle v, @PathVariable("id") int id) {
		Vehicle veh = vr.findById(id).orElseThrow();
		veh.setVehicleno(v.getVehicleno());
		return vr.save(veh);
	} 
	// http://localhost:9595/vehicleno/vn/
	@GetMapping("vehicleno/vn/{vehicleno}")
	Vehicle findByVehicleno(@PathVariable("vehicleno") String vehicleno) {

		return vr.findByVehicleno(vehicleno).orElseThrow();
	}
   
}
