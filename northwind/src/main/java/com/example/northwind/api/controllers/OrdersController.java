package com.example.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.IOrderService;
import com.example.northwind.entities.concretes.Order;

@RestController
@RequestMapping("/api/v1")
public class OrdersController{
	
	@Autowired 
	private IOrderService orderService;
	
	@GetMapping("/orders")
	public List<Order> getAll(){
		return orderService.getAll();
	}
	
	@GetMapping("/orders/{id}")
	public Order getById(@PathVariable(value="id")int orderId) throws Exception{
		return orderService.getById(orderId);
	}
	
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> delete(@PathVariable (value="id") int orderId) throws Exception{
		Order order = orderService.getById(orderId);
		orderService.delete(order);
		return ResponseEntity.ok().body("Siparis basariyla silindi.");
	}
}	
