package pkg_homework;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg) : ");
		double a = sc.nextDouble();

		System.out.print("키(m) : ");
		double b = sc.nextDouble();
		
		double bmi = a / (b * b);
		System.out.println("BMI 지수 : " + Math.round(bmi * 10) / 10.0);
		
		sc.close();
	}

}
