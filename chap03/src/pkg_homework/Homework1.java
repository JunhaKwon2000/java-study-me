package pkg_homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String word = sc.next();
		
		// String check = word.equals("간다") ? "온다" : "간다";
		String check = "간다".equals(word) ? "온다" : "간다"; // 더 나은 코드(Null 이 들어갈 수도 있잖아, 한번 생각해봐)
		System.out.println("앵무새 : " + check);
		
		sc.close();
		
	}
}
