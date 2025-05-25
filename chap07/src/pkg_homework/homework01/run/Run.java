package pkg_homework.homework01.run;

import java.util.Scanner;

import pkg_homework.homework01.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] std = new Student[3];
		
		std[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		std[2] = new Student("김철수", 21, 197.6, 86.0, 2, "경역학과");
		
		for (Student s : std) System.out.println(s.toString());
		
		
		Employee[] emp = new Employee[10];
		for (int i = 0; i < emp.length; i++) emp[i] = new Employee();
		int cnt = 0;
		System.out.println("=== 사원 입력받기 ===");
		while(true) {
			System.out.print("이름 : ");
			emp[cnt].setName(sc.nextLine());
			System.out.print("나이 : ");
			emp[cnt].setAge(sc.nextInt());
			System.out.print("키 : ");
			emp[cnt].setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			emp[cnt].setWeight(sc.nextDouble());
			System.out.print("급여 : ");
			emp[cnt].setSalary(sc.nextInt());
			sc.nextLine();
			System.out.print("부서 : ");
			emp[cnt].setDept(sc.nextLine());
			
			cnt++;
			if (cnt >= 10) break;
			System.out.print("계속 추가하시겠습니까? ");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("n")) break;
		}
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(emp[i].toString());
		}
		
		sc.close();
		
	}

}
