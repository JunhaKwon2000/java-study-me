package pkg_homework.homework08.closed.controller;

import pkg_homework.homework08.closed.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("김철수");
		p.setAge(20);
		
		System.out.println(p.getName() + "는 " + p.getAge() + "살 입니다.");
		
	}
	
}
