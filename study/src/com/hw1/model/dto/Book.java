package com.hw1.model.dto;

public abstract class Book {
	
	// field
	private String title;
	private String author;
	
	// constructor
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// method
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract void displayInfo();
	

}
