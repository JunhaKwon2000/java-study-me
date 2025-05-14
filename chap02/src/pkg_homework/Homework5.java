package pkg_homework;
import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double a = sc.nextDouble();

		System.out.print("수학 : ");
		double b = sc.nextDouble();
		
		System.out.print("영어 : ");
		double c = sc.nextDouble();
		
		int sum = (int)a + (int)b + (int)c;
		int avg = sum / 3;
		
		System.out.println(sum);
		System.out.println(avg);
		
		sc.close();

	}

}
