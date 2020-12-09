package com.marcos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
