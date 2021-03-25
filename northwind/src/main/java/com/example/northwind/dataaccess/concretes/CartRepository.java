package com.example.northwind.dataaccess.concretes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.northwind.entities.concretes.Cart;

public interface CartRepository extends JpaRepository<Cart, String>{

	public List<Cart> findByCustomerId(String customerId);
	
	public Cart findByCustomerIdAndProductId(String customerId, int productId);
}
