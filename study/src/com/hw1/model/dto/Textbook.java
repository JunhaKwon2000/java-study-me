package com.hw1.model.dto;

public class Textbook extends Book {
	
	// field
	private String subject;

	// constructor
	public Textbook() {
		super();
	}
	
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	// method
	@Override
	public void displayInfo() {
		System.out.println("[전문 서적] 제목 : " + getTitle() + " / 저자 : " + getAuthor() + " / 장르 : " + subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}



}
