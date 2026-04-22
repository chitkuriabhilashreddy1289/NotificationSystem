package com.vcube.customer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.customer.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
    Optional<Customer> getCustomerById (Integer id);
}
