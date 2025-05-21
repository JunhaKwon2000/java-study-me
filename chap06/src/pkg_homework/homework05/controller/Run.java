package pkg_homework.homework05.controller;

import pkg_homework.homework05.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.changeName("Junha Kwon");
		
		member.printName();

	}

}
