package pkg_homework;
import java.util.Scanner;

public class Homework9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String s = sc.nextLine();
		
		for (;;) {
			if (s.equals("탈출")) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
			else {
				System.out.println(s);
				System.out.print("입력 : ");
				s = sc.nextLine();				
			}
		}
		

		
	}
	
}
