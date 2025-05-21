package pkg_homework.homework08.controller;

import pkg_homework.homework08.model.vo.Person;

public class Run {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "김철수";
		p.age = 20;
		
		System.out.println(p.name + "는 " + p.age + "살 입니다.");
		
		
	}

}
