package pkg_homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int c = sc.nextInt();
		
		int min = (a <= b) ? (a <= c ? a : c) : (b <= c ? c : c); 
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
		
		sc.close();

	}
}
