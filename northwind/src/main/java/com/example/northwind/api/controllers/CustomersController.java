package com.example.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.ICustomerService;
import com.example.northwind.entities.concretes.Customer;

@RestController
@RequestMapping("/api/v1")
public class CustomersController {

	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/customers")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@GetMapping("/customers/{id}")
	public Customer findById(@PathVariable (value="id") String customerId) throws Exception {
		return customerService.findById(customerId);
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> add(@RequestBody Customer customer){
		return ResponseEntity.ok(customerService.add(customer));
	}
	
}
