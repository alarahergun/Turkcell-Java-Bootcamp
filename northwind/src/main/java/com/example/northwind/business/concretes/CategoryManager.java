package com.example.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.ICategoryService;
import com.example.northwind.dataaccess.concretes.CategoryRepository;
import com.example.northwind.entities.concretes.Category;

@Service
public class CategoryManager implements ICategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category getById(int categoryId) throws Exception{
		return categoryRepository.findById(categoryId).orElseThrow(()->new Exception("No category with id :" + categoryId));
	}

	@Override
	public Category add(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category update(Category categoryToUpdate, Category category) {
		
		categoryToUpdate.setCategoryName(category.getCategoryName());
		categoryToUpdate.setDescription(category.getDescription());
		
		Category updatedCategory = categoryToUpdate;
		return categoryRepository.save(updatedCategory);
	}

	@Override
	public void delete(Category category) {
		categoryRepository.delete(category);
	}

}
