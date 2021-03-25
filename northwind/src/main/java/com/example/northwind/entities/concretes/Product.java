package com.example.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.northwind.entities.abstracts.IEntity;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product implements IEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //buradaki id artırma tabloya bağımlı olarak yapılmalı
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	@Column(name="supplier_id")
	private int supplierId;
	@Column(name="category_id")
	private int categoryId;
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	@Column(name="unit_price")
	private double unitPrice;
	@Column(name="units_in_stock")
	private int unitsInStock;
	@Column(name="units_on_order")
	private int unitsOnOrder;
	@Column(name="reorder_level")
	private int reorderLevel;
	@Column(name="discontinued")
	private int discontinued;
	
	

}
