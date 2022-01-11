package com.promise.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    
	@Test
	void contextLoads() {
		logger.info("test started...");
		logger.info("add build pipeline");
		//given 
		SpringJenkinsApplicationTests obj = new SpringJenkinsApplicationTests();
		int res = obj.addTwoNumbers(5, 10);
		assertEquals(16, res);
	}

	int addTwoNumbers(int num1, int num2) {
		return num1 + num2;
	}
}
