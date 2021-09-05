package org.microservice.service;

import org.microservice.model.User;

public interface UserService {
	
	public User findUserById(String id);

}
