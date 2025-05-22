package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	
	// field
	private Employee[] employees;
	private int employeeCount;
	
	// constructor
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 1;
	}

	// method
	@Override
	public void addPerson(Person person) {
		
	}

	@Override
	public void removePerson(String id) {
		
	}

	@Override
	public void displayAllPersons() {
		
	}
	
}
