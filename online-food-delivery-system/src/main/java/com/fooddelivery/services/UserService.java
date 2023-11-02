package com.fooddelivery.services;

import com.fooddelivery.entity.User;

public interface UserService {

	

	User registerUser(User user);

	User login(User user);

}
