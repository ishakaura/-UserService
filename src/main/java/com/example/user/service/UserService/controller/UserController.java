package com.example.user.service.UserService.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.service.UserService.entities.User;
import com.example.user.service.UserService.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userservice;
	
	//createUser
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		
		System.out.println("hello---------------");
		
		User user1=userservice.saveUser(user);
		
		System.out.println("bye------------------------"+user1.getName());
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> getSingleUser(@PathVariable String id)
	{
		// fetch rating of user from Rating service
		Optional<User> u = userservice.getUser(id);
		return ResponseEntity.ok(u);

	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> u=userservice.getAlluser();
		return ResponseEntity.ok(u);
	}
	
	
	
}
