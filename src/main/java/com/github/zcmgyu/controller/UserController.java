package com.github.zcmgyu.controller;

import com.github.zcmgyu.model.User;
import com.github.zcmgyu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping("/accounts")
	public Iterable<User> getAccounts() {
		return userRepository.findAll();
	}

}
