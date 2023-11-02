package com.fooddelivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fooddelivery.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsernameAndEmail(String username,String email);
	Optional<User> findByUsernameAndPassword(String username,String password);
	

}
