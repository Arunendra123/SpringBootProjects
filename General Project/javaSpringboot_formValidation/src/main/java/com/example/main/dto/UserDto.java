package com.example.main.dto;

import org.springframework.stereotype.Component;

import com.example.main.entity.User;

@Component
public class UserDto {

	private String name;
	private String password;
	private String email;
	
	public UserDto() {
		super();
	}
	public UserDto(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public UserDto of(User user) {
		return new UserDto(user.getName(), user.getPassword(), user.getEmail());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
