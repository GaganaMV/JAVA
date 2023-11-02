package com.fooddelivery.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fooddelivery.entity.User;
import com.fooddelivery.exception.ResourceNotFoundException;
import com.fooddelivery.repository.UserRepository;
import com.fooddelivery.services.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		System.out.println("Registrayion successfull! "+ user);
		return userRepository.save(user);	 
	}

	@Override
	public User login(User user) {
		return this.userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword())
				.orElseThrow(()->new ResourceNotFoundException("User ", "Id",user.getUsername()+"and password "+user.getPassword()));
	
			
		
		
	}

}
