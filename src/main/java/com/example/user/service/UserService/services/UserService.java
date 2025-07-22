package com.example.user.service.UserService.services;

import java.util.List;
import java.util.Optional;

import com.example.user.service.UserService.entities.User;


public interface UserService{
	
	
	User saveUser(User u);
	
	List<User> getAlluser();
	
	Optional<User> getUser(String id);

	
		
		
		
	

}
