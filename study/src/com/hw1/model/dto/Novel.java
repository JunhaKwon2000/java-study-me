package com.hw1.model.dto;

public class Novel extends Book {
	
	// field
	private String genre;

	// constructor
	public Novel() {
		super();
	}
	
	public Novel(String title, String author, String subjects) {
		super(title, author);
		this.genre = subjects;
	}

	// method
	@Override
	public void displayInfo() {
		System.out.println("[소설] 제목 : " + getTitle() + " / 저자 : " + getAuthor() + " / 장르 : " + genre);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
