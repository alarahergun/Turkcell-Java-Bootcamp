package com.example.northwind.dataaccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.northwind.entities.concretes.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
