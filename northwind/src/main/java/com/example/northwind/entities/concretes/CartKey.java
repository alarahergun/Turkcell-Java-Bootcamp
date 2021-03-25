package com.example.northwind.entities.concretes;

import com.example.northwind.entities.abstracts.IKey;

public class CartKey implements IKey{
	private String customerId;
	private int productId;
}
