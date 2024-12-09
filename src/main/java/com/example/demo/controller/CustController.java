package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController

public class CustController {
	
	
	@Autowired
	CustomerService cser;
	@PostMapping("/addcust")
	public Customer regCustomer(@RequestBody Customer cust) 
	{
		return cser.addCustomer(cust);
	}
	
	@GetMapping("/getcust")
	public List<Customer> getCustomer() 
	{
		return cser.getCustomer();
	}
	
	@DeleteMapping("/deletecust/{id}")
	public void deleteCust(@PathVariable Integer id)
	{
		cser.deleteCustomer(id);
	}
	
	@PutMapping("/updatecust")
	public Customer updateCust(@RequestBody Customer cust)
	{
		return cser.updateCustomer(cust);
	}

}
