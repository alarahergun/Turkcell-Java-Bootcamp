package com.example.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.IProductService;
import com.example.northwind.dataaccess.concretes.ProductRepository;
import com.example.northwind.entities.concretes.Product;

@Service
public class ProductManager implements IProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	
	@Override
	public Product getById(int productId) throws Exception {
		return productRepository.findById(productId).orElseThrow(()->new Exception("No product with id " + productId));
	}
	
	@Override
	public boolean productControl(Product product) {
		
		if((product.getProductName().length())<2)
		{
			System.out.println("Urun adi en az 2 karakterden olusmalidir.");
			return false;
		}
		
		List<Product> categorySame = productRepository.findByCategoryId(product.getCategoryId());
		
		if(categorySame.size()>=10)
		{
			System.out.println("Bir kategoride en fazla 10 urun olabilir.");
			System.out.println("İstenilen kategorideki urun sayisi :" + categorySame.size());
			return false;
		}
		
		return true;
	}

	@Override
	public Product add(Product product) {
		
		if(productControl(product)) {
			return productRepository.save(product);
		}
		
		return null;
	}

	@Override
	public Product update(Product productToUpdate, Product product) {
		
		productToUpdate.setCategoryId(product.getCategoryId());
		productToUpdate.setProductName(product.getProductName());
		productToUpdate.setSupplierId(product.getSupplierId());
		productToUpdate.setQuantityPerUnit(product.getQuantityPerUnit());
		productToUpdate.setUnitPrice(product.getUnitPrice());
		productToUpdate.setDiscontinued(product.getDiscontinued());
		productToUpdate.setReorderLevel(product.getReorderLevel());
		productToUpdate.setUnitsInStock(product.getUnitsInStock());
		productToUpdate.setUnitsOnOrder(product.getUnitsOnOrder());
	
		return productRepository.save(productToUpdate);
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}
	
}
