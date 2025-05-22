package com.hw1.model.dto;

public class Poetry extends Book {
	
	// field
	private int numberOfPoems;

	// constructor
	public Poetry() {
		super();
	}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	// method
	@Override
	public void displayInfo() {
		System.out.println("[시집] 제목 : " + getTitle() + " / 저자 : " + getAuthor() + " / 장르 : " + numberOfPoems);
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
}
