package com.user.entity;

import java.util.List;

public class User {

	private int id;
	private String name;
    private String phone;
    
    private List<Contact> contactList;

    
	public User(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public User(int id, String name, String phone, List<Contact> contactList) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.contactList = contactList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	} 
}
