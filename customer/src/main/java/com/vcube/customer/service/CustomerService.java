package com.vcube.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.customer.model.Customer;
import com.vcube.customer.repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo cr;
	
	public Customer insertCustomer(Customer c) {
		return cr.save(c);
	}
	
	public List<Customer> getCustomerInfo(){
		return cr.findAll();
	}
	
	public Customer updatecustomer(Customer c) {
		return cr.save(c);
	}
	
	public void  deleteCustomer(Integer id) {
		cr.deleteById(id);
	}
	public Customer getCustomerById(Integer id) {
		return cr.findById(id).orElse(null);
	}

}
