package com.example.main.jpa.service;

import java.util.List;
import java.util.Optional;

import com.example.main.jpa.Entity.User;
import com.example.main.jpa.Repository.UserDao;

public class UserService {

	public UserService() {
		super();
	}
      
	public void listUser(UserDao userdao) {
		userdao.findAll().forEach(System.out::println);
	}
	
	public void getUserById(UserDao userdao,Integer id) {
		Optional<User> user=userdao.findById(id);
		System.out.println(user.get());
	}
	
	public void getUserByName(UserDao userdao,String name) {
		List<User> users=userdao.findByName(name);
		users.forEach(System.out::println);
	}
	
	public void getUserByNameOrPassword(UserDao userdao,String name,String password) {
		List<User> users=userdao.findByNameOrPassword(name,password);
		users.forEach(System.out::println);
	}
	
	public void getUserByNameAndPassword(UserDao userdao,String name,String password) {
		List<User> users=userdao.findByNameAndPassword(name,password);
		users.forEach(System.out::println);
	}
	
	public void getAllUser(UserDao userdao) {
		userdao.getAllUser().forEach(System.out::println);
	}
	
	public void getAllUserByName(UserDao userdao,String name) {
		userdao.getAllUserByName(name).forEach(System.out::println);
	}
}
