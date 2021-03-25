package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Category;

public interface ICategoryService {

	public List<Category> getAll();
	public Category getById(int categoryId) throws Exception;
	public Category add(Category category);
	public Category update(Category categoryToUpdate, Category category);
	public void delete(Category category);
}
