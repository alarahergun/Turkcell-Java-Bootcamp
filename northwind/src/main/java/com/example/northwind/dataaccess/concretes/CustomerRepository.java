package com.example.northwind.dataaccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.northwind.entities.concretes.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
