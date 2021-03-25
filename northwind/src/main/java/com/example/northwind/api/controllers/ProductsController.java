package com.example.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.IProductService;
import com.example.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/v1")
public class ProductsController {
	
	@Autowired
	IProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return productService.getAll();
	}
	
	@GetMapping("/products/{id}")
	public Product getById(@PathVariable(value="id")int productId) throws Exception{
		return productService.getById(productId);
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> add(@RequestBody Product product){
		
		System.out.println(product.getProductName()); 
		return ResponseEntity.ok(productService.add(product));
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> update(@PathVariable(value="id")int productId,
				@RequestBody Product product) throws Exception
	{	
		Product productToUpdate = productService.getById(productId);
		return ResponseEntity.ok(productService.update(productToUpdate, product));
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> delete(@PathVariable(value="id")int productId) throws Exception
	{
		Product productToDelete = productService.getById(productId);	
		productService.delete(productToDelete);
		
		return ResponseEntity.ok().body("Urun basariyla silindi.");
	}
}
