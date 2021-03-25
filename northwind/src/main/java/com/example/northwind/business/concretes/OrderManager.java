package com.example.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.IOrderService;
import com.example.northwind.dataaccess.concretes.OrderRepository;
import com.example.northwind.entities.concretes.Order;

@Service
public class OrderManager implements IOrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order getById(int orderId) throws Exception {
		return orderRepository.findById(orderId)
				.orElseThrow(()-> new Exception(orderId + " kodlu bir siparis bulunmamakta."));
	}

	@Override
	public Order add(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public void delete(Order order) {
		orderRepository.delete(order);
		
	}
	
}
