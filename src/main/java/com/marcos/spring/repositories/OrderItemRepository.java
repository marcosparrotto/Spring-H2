package com.marcos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
