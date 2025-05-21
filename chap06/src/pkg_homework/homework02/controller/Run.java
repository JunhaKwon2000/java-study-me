package pkg_homework.homework02.controller;

import pkg_homework.homework02.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.phoneNumber = "01012345678";
		p1.height = 190.5;
		p1.weight = 100.2;
		System.out.println("Person1 Info: " + p1.phoneNumber + "(" + p1.height + "cm, " + p1.weight + "kg)");
		
		Person p2 = new Person();
		p2.phoneNumber = "01056434563";
		p2.height = 175.4;
		p2.weight = 65.6;
		System.out.println("Person2 Info: " + p2.phoneNumber + "(" + p2.height + "cm, " + p2.weight + "kg)");
	}

}
