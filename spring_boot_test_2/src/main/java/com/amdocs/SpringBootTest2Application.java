package com.amdocs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest2Application {

	private static final Logger logger =  LoggerFactory.getLogger(SpringBootTest2Application.class);
	
	public static void main(String[] args) {
		logger.info("some informative information for the use .");
		SpringApplication.run(SpringBootTest2Application.class, args);
	}
}
