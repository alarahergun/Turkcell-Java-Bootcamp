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

import com.example.northwind.business.abstracts.ICategoryService;
import com.example.northwind.entities.concretes.Category;

@RestController
@RequestMapping("/api/v1")
public class CategoriesController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> getAll(){
		return categoryService.getAll();
	}
	
	@GetMapping("/categories/{id}")
	public Category getById(@PathVariable (value="id")int categoryId) throws Exception{
		return categoryService.getById(categoryId);
	}
	
	@PostMapping("/categories")
	public ResponseEntity<Category> add(@RequestBody Category category) {
		System.out.println(category.getCategoryName()); 
		return ResponseEntity.ok(categoryService.add(category));
		
	}
	
	@PutMapping("/categories/{id}")
	public ResponseEntity<Category> update(@PathVariable(value="id")int categoryId,
			@RequestBody Category category) throws Exception
	{
		Category categoryToUpdate = categoryService.getById(categoryId);
		return ResponseEntity.ok(categoryService.update(categoryToUpdate, category));
	}
	
	
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<String> delete(@PathVariable(value="id")int categoryId) throws Exception
	{
		Category categoryToDelete = categoryService.getById(categoryId);
		categoryService.delete(categoryToDelete);
		return ResponseEntity.ok().body("Kategori basariyla silindi");
	}
}
