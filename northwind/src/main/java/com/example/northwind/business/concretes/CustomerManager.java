package com.example.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.ICustomerService;
import com.example.northwind.dataaccess.concretes.CustomerRepository;
import com.example.northwind.entities.concretes.Customer;

@Service
public class CustomerManager implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}
	
	@Override
	public Customer findById(String customerId) throws Exception {
		return customerRepository.findById(customerId).orElseThrow(()-> new Exception ("Bu koda sahip musteri yok."));
	}

	@Override
	public Customer add(Customer customer) {
		return customerRepository.save(customer);
	}

	
	
	

}
