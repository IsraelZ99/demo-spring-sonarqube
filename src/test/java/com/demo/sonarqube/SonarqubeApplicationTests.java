package com.demo.sonarqube;

import com.demo.sonarqube.message.MessageController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarqubeApplicationTests {

	@Autowired
	private MessageController messageController;

	@Test
	void TestGetMessage(){
		String message = messageController.getMessage();
		Assertions.assertNotNull(message);
	}

}
