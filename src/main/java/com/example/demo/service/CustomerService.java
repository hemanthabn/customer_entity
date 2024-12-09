package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	public  CustomerRepository crepo;
	
	
	
	public Customer addCustomer(Customer cust) 
	{
		return crepo.save(cust);
	}
	
	public List<Customer> getCustomer()
	{		
		return crepo.findAll();
	}
	
	
	public void deleteCustomer(int id)
	{
		crepo.deleteById(id);
	}
	public Customer updateCustomer(Customer cust)
	{
		Integer id=cust.getId();
		Customer cust1 = crepo.findById(id).get();
		cust1.setName(cust.getName());
		cust1.setOrderId(cust.getOrderId());
		cust1.setPhone_no(cust.getPhone_no());
		cust1.setEmail(cust.getEmail());
		return crepo.save(cust); 
	}
}
