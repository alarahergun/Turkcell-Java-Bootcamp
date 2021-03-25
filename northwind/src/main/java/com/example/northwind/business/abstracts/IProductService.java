package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Product;

public interface IProductService {
	
	public List<Product> getAll();
	public Product getById(int productId) throws Exception;
	public Product add(Product product);
	public Product update(Product productToUpdate, Product product);
	public void delete(Product product);
	public boolean productControl(Product product);
}
