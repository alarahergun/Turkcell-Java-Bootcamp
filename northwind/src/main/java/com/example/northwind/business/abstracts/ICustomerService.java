package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Customer;

public interface ICustomerService {
	
	public Customer findById(String customerId) throws Exception;
	public Customer add(Customer customer);
	public List<Customer> getAll();
}
