package com.example.main.entity;

public class Book {

	private int id;
	private String name;
	private int pageNumber;
	public Book(int id, String name, int pageNumber) {
		super();
		this.id = id;
		this.name = name;
		this.pageNumber = pageNumber;
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
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pageNumber=" + pageNumber + "]";
	}

}
