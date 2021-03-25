package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Cart;

public interface ICartService {

	public List<Cart> getAll();
	public List<Cart> getByCustomerId(String customerId);
	public Cart add(Cart cart);
	public Cart reduce(Cart cartToReduce, Cart cart);
	public void delete(List<Cart> cartsToDelete); //satis islemleri icin
	public void delete(Cart cartToDelete);
	public List<Cart> update(List<Cart> cartsToUpdate, Cart cart);
	public boolean productExists(int productId, String customerId);
	public Cart getByProductIdAndCustomerId(int productId, String customerId);
}
