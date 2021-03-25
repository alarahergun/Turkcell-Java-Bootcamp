package com.example.northwind.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.northwind.business.abstracts.ICustomerService;
import com.example.northwind.business.abstracts.ISaleService;
import com.example.northwind.entities.concretes.Customer;
import com.example.northwind.entities.concretes.OrderDetail;

@RestController
@RequestMapping("/api/v1")
public class SalesController {

	@Autowired
	private ISaleService saleService;
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/sales/{id}/success")
	public ResponseEntity<List<OrderDetail>> sell(@PathVariable(value="id") String customerId) throws Exception{
		
		Customer customer = customerService.findById(customerId);
		
		return ResponseEntity.ok(saleService.sell(customer));
	}
	
	
}
