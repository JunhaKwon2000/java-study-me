package com.hw2.model.dto;

public class Employee extends Person {

	// field
	private String position;
	
	// constructor
	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}

	@Override
	public String getinfo() {
		return null;
	}
	
}
