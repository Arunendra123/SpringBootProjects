package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImp userServiceImp;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("{userId}")
	public User getUser(@PathVariable int userId) {
		User user= userServiceImp.getUser(userId);
		List<Contact> contact=restTemplate.getForObject("http://Contact-service/contacts/"+user.getId(), List.class);
		user.setContactList(contact);
		return user;
	}
}
