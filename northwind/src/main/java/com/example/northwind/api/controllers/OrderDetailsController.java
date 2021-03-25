package com.example.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.IOrderDetailService;
import com.example.northwind.entities.concretes.OrderDetail;

@RestController
@RequestMapping("/api/v1")
public class OrderDetailsController{
	
	@Autowired
	private IOrderDetailService orderDetailService;
	
	@GetMapping("/orderdetails")
	public List<OrderDetail> getAll(){
		return orderDetailService.getAll();
	}
	
	@GetMapping("/orderdetails/{id}")
	public List<OrderDetail> getByOrderId(@PathVariable (value="id") int orderId){
		return orderDetailService.getByOrderId(orderId);
	}
	
	@DeleteMapping("/orderdetails/{id}")
	public ResponseEntity<String> delete(@PathVariable (value="id") int orderId){
		List<OrderDetail> orderDetails = orderDetailService.getByOrderId(orderId);
		orderDetailService.delete(orderDetails);
		return ResponseEntity.ok().body("İlgili urun detaylari silindi");
	}
}
