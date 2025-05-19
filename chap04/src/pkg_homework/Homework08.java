package pkg_homework;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int a = sc.nextInt();
		
		while (true) {
			if (a < 0) {
				System.out.println("양수만 입력해주세요.");
				System.out.print("숫자 : ");
				a = sc.nextInt();
			}
			else if (a > 9) {
				System.out.println("9이하의 숫자를 입력해주세요.");
				System.out.print("숫자 : ");
				a = sc.nextInt();
			}
			else if (a == 0) break;
			else {
				System.out.println("=== " + a + "단 ===");
				for (int j = a; j <= 9; j++) {					
					for (int i = 1; i <= 9; i++) {
						System.out.println(a + " X " + i + " = " + (a * i));
					}
					System.out.println();
				}
				System.out.print("숫자 : ");
				a = sc.nextInt();
			}
		}
		
		sc.close();
		
	}
}
