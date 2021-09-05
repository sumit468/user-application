package org.microservice.application;

import org.microservice.model.User;
import org.microservice.service.ExcelService;
import org.microservice.service.ExcelServiceImpl;
import org.microservice.service.UserService;
import org.microservice.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	@Bean
	public ExcelService excelService() {
		return new ExcelServiceImpl();
	}

	@Bean
	public User user() {
		return new User();
	}

}
