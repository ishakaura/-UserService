package com.example.user.service.UserService.servicesImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.service.UserService.entities.User;
import com.example.user.service.UserService.repositories.UserRepository;
import com.example.user.service.UserService.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	
	
	@Override
	public User saveUser(User u) {
		// TODO Auto-generated method stub
		
	String uid=UUID.randomUUID().toString();
	u.setUserId(uid);
		return userRepo.save(u);
	}

	@Override
	public List<User> getAlluser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUser(String id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
		
	
	}

}
