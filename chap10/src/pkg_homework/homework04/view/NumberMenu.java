package pkg_homework.homework04.view;

import java.util.Scanner;

import pkg_homework.homework04.controller.NumberController;
import pkg_homework.homework04.exception.NumRangeException;

public class NumberMenu {
	
	// method
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		try {
			boolean result = nc.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가? " + result);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
