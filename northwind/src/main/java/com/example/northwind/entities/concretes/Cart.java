package com.example.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.example.northwind.dataaccess.mapping.CartKey;
import com.example.northwind.entities.abstracts.IEntity;
import lombok.Data;

@Data
@Entity
@IdClass(CartKey.class)
@Table(name="carts")
public class Cart implements IEntity{
	
	@Id
	@Column(name="customer_id")
	private String customerId;
	
	@Id
	@Column(name="product_id") 
	private int productId;
	
	@Column(name="quantity") 
	private int quantity;

	@Column(name="discount") 
	private Double discount; 
}
