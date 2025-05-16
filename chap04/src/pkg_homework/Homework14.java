package pkg_homework;

import java.util.Scanner;

public class Homework14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int a = sc.nextInt();
		
		while(true) {
			
			if (a <= 0) {
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				a = sc.nextInt();
			}
			else {
				for (int i = 1; i <= a; i++) {
					if (i % 2 == 1) System.out.print("박");
					else System.out.print("수");
				}
				break;
			}

		}
		
		sc.close();
	
	}
	
	
}
