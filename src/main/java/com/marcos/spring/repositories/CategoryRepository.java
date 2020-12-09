package com.marcos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
