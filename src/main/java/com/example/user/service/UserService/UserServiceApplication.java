package com.example.user.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static Logger logger=LoggerFactory.getLogger(UserServiceApplication.class);
	
	@PostConstruct
	public int init() {
		
		logger.info("hello lgger jenkins work");
		logger.info("hello lgger jenkinggggggs work");
	}
	public static void main(String[] args) {
		
		logger.info("hello lgger jenkins work");
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
