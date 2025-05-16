package pkg_homework;

import java.util.Scanner;

public class Homework7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(1~50) : ");
		int a = sc.nextInt();
		
		while (true) {
			if (a > 50 || a < 1) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
				System.out.print("정수(1~50) : ");
				a = sc.nextInt();
			}
			else {
				break;
			}
		}
		
		
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) sum += i;
		}
		
		System.out.println("합계 = " + sum);
		
		sc.close();
	}

}
