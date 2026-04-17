package com.vcube.springapp04.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//
import com.vcube.springapp04.model.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{
	
	Optional<Vehicle> findByVehicleno(String vehicleno);

}
