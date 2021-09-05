package org.microservice.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.microservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

	@Autowired
	private ExcelService excelService;

	@Override
	public User findUserById(String id) {
		User user = null;
		try {
			user = excelService.readData(id);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
	}

}
