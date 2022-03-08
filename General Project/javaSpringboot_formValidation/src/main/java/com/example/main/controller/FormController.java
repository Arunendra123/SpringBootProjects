package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.User;
import com.example.main.service.UserService;

@RestController("api")
public class FormController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		userService.saveUser(user);
		return user;
	}
	
	@GetMapping("/list")
	public List<User> list() {
		return userService.getUsers();
	}
}
