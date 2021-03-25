package com.example.northwind.dataaccess.concretes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.northwind.entities.concretes.Product;


public interface ProductRepository extends JpaRepository<Product,Integer>  {

	//jpa query işlemleri için sağlanan bir imkanı kullanarak uğraşmadan hallediyoruz
	
	public List<Product> findByCategoryId(int categoryId);
	public void deleteByCategoryId(int categoryId);
}
