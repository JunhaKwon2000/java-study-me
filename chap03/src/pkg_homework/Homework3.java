package pkg_homework;
import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구 수 : ");
		int friends = sc.nextInt();
		System.out.print("사탕의 수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / friends);
		System.out.println("남는 사탕 개수 : " + candy % friends);
		
		sc.close();
	}
}
