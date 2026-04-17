package com.example.SpringApp05.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringApp05.model.Bike;
@Repository
public interface BikeRepository extends JpaRepository<Bike,Integer>{

	Optional<Bike> findByModel(String model);
}
