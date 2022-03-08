package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

	public User getUser(int id);
	public List<User> getUsers();
	public void addUser(User user);
	public void deleteUser(User user);
	public User updateUSer(User user);
}
