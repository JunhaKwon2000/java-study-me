package pkg_homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double a = sc.nextDouble();

		System.out.print("세로 : ");
		double b = sc.nextDouble();
		
		double area = a * b;
		double boundary = 2 * (a + b);
		System.out.println("면적 : " + Math.round(area * 100) / 100.0);
		System.out.println("둘레 : " + Math.round(boundary * 10) / 10.0);
		
		sc.close();
		
		
	}

}
