package pkg_homework.homework07.controller;

import pkg_homework.homework07.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmpNo(100);
		emp.setEmpName("홍길동");
		emp.setDept("영업부");
		emp.setJob("과장");
		emp.setAge(25);
		emp.setSalary(3000000);
		emp.setPhone("010-123-4567");
		emp.setAddress("서울시 강남구");
		
		emp.getEmpName();
		emp.getEmpNo();
		emp.getDept();
		emp.getJob();
		emp.getAge();
		emp.getSalary();
		emp.getPhone();
		emp.getAddress();
	}
	
}
