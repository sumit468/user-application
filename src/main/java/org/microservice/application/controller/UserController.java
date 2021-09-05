package org.microservice.application.controller;

import org.microservice.model.User;
import org.microservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class UserController.
 */
@RestController
public class UserController {

	/** The user service. */
	@Autowired
	private UserService userService;

	/**
	 * Gets the user.
	 *
	 * @param id the id
	 * @return the user
	 */
	@ResponseBody
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable String id) {
		User user = userService.findUserById(id);
		return user;
	}

}
