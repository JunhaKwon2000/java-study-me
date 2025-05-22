package com.hw2.model.dto;

public class Prisoner extends Person {

	// field
	private String crime;
	
	// constructor
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}

	@Override
	public String getinfo() {
		return null;
	}
	
	
}
