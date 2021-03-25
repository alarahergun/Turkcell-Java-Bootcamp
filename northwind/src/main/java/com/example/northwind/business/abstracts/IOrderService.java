package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Order;

public interface IOrderService {
	
	public List<Order> getAll();
	public Order getById(int orderId) throws Exception;
	public Order add(Order order);
	public void delete(Order order);
	
	//update olmalı mı sorulacak
	//mantıken delete opsiyonu olmamalı

}
