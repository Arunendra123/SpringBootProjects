package com.contact.entity;

public class Contact {

	private int id;
	private String conctactName;
	private String email;
	private int userId;
	
	public Contact(int id, String conctactName, String email, int userId) {
		super();
		this.id = id;
		this.conctactName = conctactName;
		this.email = email;
		this.userId = userId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConctactName() {
		return conctactName;
	}
	public void setConctactName(String conctactName) {
		this.conctactName = conctactName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
