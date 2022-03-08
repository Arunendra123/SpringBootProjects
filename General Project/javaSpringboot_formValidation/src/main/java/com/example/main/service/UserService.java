package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.main.dao.UserDao;
import com.example.main.entity.User;

@Component
public class UserService {

	@Autowired
	private UserDao userdao;
	
	public void saveUser(User user) {
		userdao.save(user);
	}
	
	public List<User> getUsers() {
		List<User> list= userdao.findAll();
		if(list.isEmpty()) {
			AddDummy();
		}
		return userdao.findAll();
	}
	
	public void AddDummy() {
	     userdao.save(new User("admin","admin","admin@gmail.com"));
	}
}
