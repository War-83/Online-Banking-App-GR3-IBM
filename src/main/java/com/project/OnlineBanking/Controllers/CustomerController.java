package com.project.OnlineBanking.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.OnlineBanking.Models.Customer;
import com.project.OnlineBanking.Services.CustomerService;



@RestController
public class CustomerController {
	@Autowired
	CustomerService ser;
	
	
	@PostMapping
	public void CreateCustomer(Customer model) {
		ser.CreateCustomer(model);
	}
	
	
	@GetMapping("/customers/{id}")
	public List<Customer> GetCustomer(@PathVariable String id){
		ser.GetCustomer(id);
		return null;
		
	}
	
	@PutMapping("/customers/{id}")
	public void PutCustomer(@PathVariable String id){
		ser.PutCustomer(id);
		
	}
	
	
	@DeleteMapping("/customers/{id}")
	public void DeleteCustomer(@PathVariable String id){
		ser.DeleteCustomer(id);
		
	}
	
	
}
