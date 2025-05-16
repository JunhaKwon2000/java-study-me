package pkg_homework;

import java.util.Scanner;

public class Homework12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = 0;

		
		System.out.print("숫자(0을 입력하면 종료) : ");
		a = sc.nextInt();
		
		while(true) {
			
			if (a > 0) {
				sum += a;
				System.out.print("숫자(0을 입력하면 종료) : ");
				a = sc.nextInt();
			}
			else if (a < 0) {
				System.out.print("숫자(0을 입력하면 종료) : ");
				a = sc.nextInt();
			}
			else if (a == 0) break;
			
		}
		System.out.println("양수의 합계 : " + sum);
		sc.close();
		
	}

}
