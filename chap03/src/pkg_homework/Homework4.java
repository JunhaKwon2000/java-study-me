package pkg_homework;
import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.println("합계 : " + (korean + math + english));
		double avg = (korean + math + english) / 3.0;
		System.out.println("평균 : " + Math.round(avg));
		System.out.println((avg >= 90.0 && korean >= 60 && math >= 60 && english >= 60) ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.");
		
		sc.close();
	}
}
