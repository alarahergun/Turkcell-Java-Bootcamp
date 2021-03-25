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

import com.example.northwind.business.abstracts.ICartService;
import com.example.northwind.entities.concretes.Cart;

@RestController
@RequestMapping("/api/v1")
public class CartsController {
	
	@Autowired
	private ICartService cartService;
	
	@GetMapping("/carts")
	public List<Cart> getAll(){
		return cartService.getAll();
	}
	
	@GetMapping("/carts/{id}")
	public List<Cart> getByCustomerId(@PathVariable (value="id") String customerId){
		return cartService.getByCustomerId(customerId);
	}
	
	@PostMapping("/carts")
		public ResponseEntity<Cart> add(@RequestBody Cart cart) {
		return ResponseEntity.ok(cartService.add(cart));
	}
	
	@PutMapping("/carts/{id}/{productId}")
	public ResponseEntity<Cart> reduce(@PathVariable (value="id") String customerId, @PathVariable (value="productId") int productId, @RequestBody Cart cart)
	{	
		Cart cartToReduce = cartService.getByProductIdAndCustomerId(productId, customerId);
		return ResponseEntity.ok(cartService.reduce(cartToReduce, cart));
	}
	
	@PutMapping("/carts/{id}")
	public ResponseEntity<List<Cart>> update( 
			@PathVariable (value="id") String customerId, @RequestBody Cart cart)
	{
		List<Cart> cartsToUpdate = cartService.getByCustomerId(customerId);
		return ResponseEntity.ok(cartService.update(cartsToUpdate, cart));
	}
	
	@DeleteMapping("/carts/{id}")
	public ResponseEntity<String> delete(@PathVariable(value="id")String customerId)
		{
			List<Cart> cartsToDelete = cartService.getByCustomerId(customerId);
			cartService.delete(cartsToDelete);
			return ResponseEntity.ok().body("İlgili sepetler silindi.");
		} 
	
	@DeleteMapping("/carts/{id}/{productId}")
	public ResponseEntity<String> delete(@PathVariable(value="id") String customerId, @PathVariable (value="productId") int productId)
	{
		Cart cartToDelete = cartService.getByProductIdAndCustomerId(productId, customerId);
		cartService.delete(cartToDelete);
		return ResponseEntity.ok().body("İlgili sepet silindi.");
	}

}
