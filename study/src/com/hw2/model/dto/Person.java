package com.hw2.model.dto;

public abstract class Person {
	
	// field
	protected String id;
	protected String name;
	
	// constructor
	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// method
	public abstract String getinfo();
	
}
