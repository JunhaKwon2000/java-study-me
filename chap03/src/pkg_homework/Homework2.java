package pkg_homework;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int number = sc.nextInt();
		
		String evenOdd = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.println("구슬의 개수는 " + evenOdd + "입니다.");
		
		sc.close();
	}
}
