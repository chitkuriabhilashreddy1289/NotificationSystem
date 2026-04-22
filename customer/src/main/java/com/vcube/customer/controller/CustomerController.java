package com.vcube.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vcube.customer.model.Customer;
import com.vcube.customer.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	@PostMapping("/insert")
	String insertCustomer(@ModelAttribute Customer c) {
		cs.insertCustomer(c);
		return "redirect:/";
	}
	@GetMapping("/")
	String getCusdeatails(Model model) {
	model.addAttribute("customer",cs.getCustomerInfo());
		return "index";
	}
	@PostMapping("/update")
	String update(@ModelAttribute Customer c) {
		cs.updatecustomer(c);
		return "redirect:/";
	}
	@GetMapping("/delete/{id}")
	String deleteCustomer(@PathVariable Integer id) {
		cs.deleteCustomer(id);
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	String editCustomer(@PathVariable Integer id,Model model) {
		Customer c=cs.getCustomerById(id);
		model.addAttribute("customerObj", c);
		return "edit";
		
	}

}
