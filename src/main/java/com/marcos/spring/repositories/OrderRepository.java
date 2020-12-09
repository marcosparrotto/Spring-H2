package com.marcos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
