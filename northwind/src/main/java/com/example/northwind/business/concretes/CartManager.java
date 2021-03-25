package com.example.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.ICartService;
import com.example.northwind.dataaccess.concretes.CartRepository;
import com.example.northwind.dataaccess.concretes.CustomerRepository;
import com.example.northwind.dataaccess.concretes.ProductRepository;
import com.example.northwind.entities.concretes.Cart;

@Service
public class CartManager implements ICartService{
	
	@Autowired 
	private CartRepository cartRepository;
	@Autowired 
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Cart> getAll() { 
		return cartRepository.findAll();
	}

	@Override
	public List<Cart> getByCustomerId(String customerId){
		
		List<Cart> cartByCustomer = cartRepository.findByCustomerId(customerId);

		if(cartByCustomer.size()>0)
		{
			return cartByCustomer;
		}
		
		System.out.println(customerId + " kodlu musterinin sepetinde urun yok!");
		return null;
	}

	@Override
	public Cart add(Cart cart) { 
	
		if(!customerRepository.existsById(cart.getCustomerId())) {
			System.out.println("Musteri veritabanina eklenmemis.");
			return null;
		}
		
		if(!productRepository.existsById(cart.getProductId())) {
			System.out.println("Urun veritabanina eklenmemis.");
			return null;
		} 
		
		if(productExists(cart.getProductId(), cart.getCustomerId())) {
				Cart oldCart = cartRepository.findByCustomerIdAndProductId(cart.getCustomerId(), cart.getProductId()); 
				cart.setQuantity(oldCart.getQuantity() + 1);
				System.out.println("Urun adedi bir artirildi.");
				return cartRepository.save(cart);	
			}
		
		cart.setQuantity(1);
		return cartRepository.save(cart);
	}

	@Override
	public Cart reduce(Cart cartToReduce, Cart cart) { 
	
		if(cart.getQuantity() <0) {
			System.out.println("Urun adedi en az 0 olabilir.");
			return null;
		}
		
			cartToReduce.setQuantity(cart.getQuantity());
			System.out.println("Urun adedi guncellendi");
			
			if(cartToReduce.getQuantity() == 0) {
				cartRepository.delete(cartToReduce);
				return null;
			}
			
			return cartRepository.save(cartToReduce);
	}
	
	@Override
	public List<Cart> update(List<Cart> cartsToUpdate, Cart cart) {
		
		for(Cart i : cartsToUpdate) {
				Cart oldCart =  cartRepository.findByCustomerIdAndProductId(i.getCustomerId(), i.getProductId());
				oldCart.setDiscount(cart.getDiscount());
				cartRepository.save(oldCart);
			}
		
			return cartsToUpdate;
		}

	@Override
	public void delete(List<Cart> cartsToDelete) { //satın alınma durumunda sepeti silecek olan fonksiyon
		
		for(Cart i:cartsToDelete){
			cartRepository.delete(i);
		}
		
	}
	
	@Override
	public void delete(Cart cartToDelete) {
		cartRepository.delete(cartToDelete);
	}
	
	@Override
	public boolean productExists(int productId, String customerId) {
		
		List<Cart> cartsByCustomer = cartRepository.findByCustomerId(customerId);
		
		if(cartsByCustomer.size() <= 0){
			System.out.println(customerId + " kodlu musterinin sepetinde urun yok.");
			return false;
		}
		
		Cart cartByCustomerAndProduct = cartRepository.findByCustomerIdAndProductId(customerId, productId);
		
		if(cartByCustomerAndProduct == null) {
			System.out.println("Sepete daha once " + productId + " kodlu urunden eklenmemis.");
			return false;
		}
		
		return true;
	}

	@Override
	public Cart getByProductIdAndCustomerId(int productId, String customerId) {
		Cart cart = cartRepository.findByCustomerIdAndProductId(customerId, productId);
		return cart;
	}

	
	
	
	
}
