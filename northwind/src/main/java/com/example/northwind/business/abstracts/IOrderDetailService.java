package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.OrderDetail;

public interface IOrderDetailService {

	public List<OrderDetail> getAll();
	public List<OrderDetail> getByOrderId(int orderId);
	public void delete(List<OrderDetail> orderDetails);
	
}
