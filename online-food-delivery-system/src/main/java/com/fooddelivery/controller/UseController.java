package com.fooddelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fooddelivery.entity.User;
import com.fooddelivery.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UseController {
	 @Autowired
	 private UserService userService; 
	 
	 @PostMapping("/register")
	 public ResponseEntity<User> registerUser(@Valid @RequestBody User user){
		 User registerUser = userService.registerUser(user);
		 return new ResponseEntity<>(registerUser,HttpStatus.CREATED); 
	 }
	 
	 public ResponseEntity<User> login(@RequestBody User user){
		 User login = userService.login(user);
		 return new ResponseEntity<>(login,HttpStatus.OK);
		
	 }
	
	

}
