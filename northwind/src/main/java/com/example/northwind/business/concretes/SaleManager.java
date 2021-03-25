package com.example.northwind.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.ISaleService;
import com.example.northwind.dataaccess.concretes.CartRepository;
import com.example.northwind.dataaccess.concretes.OrderDetailRepository;
import com.example.northwind.dataaccess.concretes.OrderRepository;
import com.example.northwind.dataaccess.concretes.ProductRepository;
import com.example.northwind.entities.concretes.Cart;
import com.example.northwind.entities.concretes.Customer;
import com.example.northwind.entities.concretes.Order;
import com.example.northwind.entities.concretes.OrderDetail;
import com.example.northwind.entities.concretes.Product;


@Service
public class SaleManager implements ISaleService{
	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	@Autowired
	private CartRepository cartRepository;
	@Autowired 
	private ProductRepository productRepository;
	
	
	@Override
	public List<OrderDetail> sell(Customer customer) throws Exception { 
		
		Order order = addOrder(customer);
		List<OrderDetail> orderDetails = addOrderDetail(customer, order);
		List<Cart> cartsByCustomer = cartRepository.findByCustomerId(customer.getCustomerId());
		deleteRemainingCarts(cartsByCustomer);
		
		return orderDetails;
	}
	
	@Override
	public Order addOrder(Customer customer) {
		
		Order order = new Order();
		order.setCustomerId(customer.getCustomerId());
		
		return orderRepository.save(order);
	}
	
	@Override
	public List<OrderDetail> addOrderDetail(Customer customer, Order order) throws Exception { 
		
		
		List<Cart> cartsByCustomer = cartRepository.findByCustomerId(customer.getCustomerId());
		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>(); 
		
		for(Cart i : cartsByCustomer) {
			
			OrderDetail orderDetail = new OrderDetail();
			
			orderDetail.setOrderId(order.getOrderId());
			orderDetail.setProductId(i.getProductId());
			orderDetail.setQuantity(i.getQuantity());
			orderDetail.setDiscount(i.getDiscount());
			Product product = 
				productRepository.findById(i.getProductId()).orElseThrow(()-> new Exception("Bu id'ye sahip urun yok!)"));
			orderDetail.setUnitPrice(product.getUnitPrice());
			
			orderDetailRepository.save(orderDetail);
			orderDetails.add(orderDetail);
		}
		
		return orderDetails;
	}

	@Override
	public void deleteRemainingCarts(List<Cart> cartsToDelete) {
		
		for(Cart i : cartsToDelete) {
			cartRepository.delete(i);
		}
		
	}
	
	
	
	
	
	

	
}
