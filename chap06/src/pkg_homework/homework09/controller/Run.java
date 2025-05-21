package pkg_homework.homework09.controller;

import pkg_homework.homework09.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("김철수");
		s1.setClassName("A");
		s1.getId();
		s1.getName();
		s1.getClassName();
		
		System.out.println();
		
		Student s2 = new Student();
		s2.setName("홍길동");
		s2.setClassName("F");
		s2.setClassName("A");
		s2.getId();
		s2.getName();
		s2.getClassName();
		
		System.out.println();
		
		Student s3 = new Student();
		s3.setName("이영희");
		s3.setClassName("B");
		s3.setClassName("A");
		s3.getId();
		s3.getName();
		s3.getClassName();
	}

}
