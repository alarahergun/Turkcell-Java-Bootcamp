package com.example.northwind.entities.concretes;

import com.example.northwind.entities.abstracts.IKey;

public class OrderDetailKey implements IKey{
	private int orderId;
	private int productId;
}
