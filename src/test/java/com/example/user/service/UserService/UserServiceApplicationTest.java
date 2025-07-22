package com.example.user.service.UserService;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class UserServicesApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(UserServicesApplicationTests.class);
	
	
	@Test
	void contextLoads() {
		logger.info("test case mesage executing");
		Assert.isTrue(true, "hello");
	}

}
