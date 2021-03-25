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
@Table(name="categories")
public class Category implements IEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id artırma tabloya bağımlı olarak yapılmalı
	@Column(name="category_id")
	private int id;
	
	@Column(name="category_name", length = 255)
	private String categoryName;
	
	@Column(name="description")
	private String description;
	
	//picture alanı nullable kabul ediliyor bu nedenle eklenmeyecek
}
