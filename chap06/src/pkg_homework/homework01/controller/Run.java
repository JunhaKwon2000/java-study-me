package pkg_homework.homework01.controller;

import pkg_homework.homework01.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "김철수";
		emp1.team = "교육운영팀";
		System.out.println("Employee: " + emp1.name + "(" + emp1.team + ")");
		
		
		Employee emp2 = new Employee();
		emp2.name = "이영희";
		emp2.team = "경영지원팀";
		System.out.println("Employee: " + emp2.name + "(" + emp2.team + ")");
		
	}
}
