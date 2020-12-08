package com.marcos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcos.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
