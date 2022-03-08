package com.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImp implements UserService {

	
	// Fake DataBase
	private List<User> userList;
	
	UserServiceImp(){
		userList=new ArrayList<User>();
		userList.add(new User(111,"Arunendra","8417808076"));
		userList.add(new User(112,"Prakash","9935156888"));
		userList.add(new User(113,"Arun","9454056478"));
		userList.add(new User(114,"Saroj","8413434076"));
	}
	
	@Override
	public User getUser(int id) {
		return userList.stream().filter(user->user.getId()==id).findFirst().orElse(null);
	}

	@Override
	public List<User> getUsers() {
		return null;
	}

	@Override
	public void addUser(User user) {

	}

	@Override
	public void deleteUser(User user) {
		
	}

	@Override
	public User updateUSer(User user) {
		return null;
	}

}
