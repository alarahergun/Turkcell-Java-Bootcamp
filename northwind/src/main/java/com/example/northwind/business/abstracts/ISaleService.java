package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Cart;
import com.example.northwind.entities.concretes.Customer;
import com.example.northwind.entities.concretes.Order;
import com.example.northwind.entities.concretes.OrderDetail;

public interface ISaleService {

	public List<OrderDetail> sell(Customer customer) throws Exception;
	public Order addOrder(Customer customer);
	public List<OrderDetail> addOrderDetail(Customer customer, Order order) throws Exception;
	public void deleteRemainingCarts(List<Cart> cartsToDelete);
}
