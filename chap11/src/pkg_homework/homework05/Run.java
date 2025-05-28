package pkg_homework.homework05;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("생년월일 : ");
		String birthday = sc.nextLine();
		
		String birthdayYear = birthday.substring(0, 4);
		// String birthdayMonth = birthday.substring(4, 6);
		String birthdayDay = birthday.substring(6);
		
		String code = name.substring(0, 1) + birthdayYear.substring(2) + birthdayDay + name.substring(1);
		System.out.println(code);
		
		sc.close();
		
	}

}
