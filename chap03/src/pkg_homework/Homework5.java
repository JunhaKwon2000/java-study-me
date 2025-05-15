package pkg_homework;
import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-) :");
		char id = sc.next().charAt(7);
		
		System.out.println((id == '1' || id == '3') ? "입력하신 주민번호는 남성입니다." : ((id == '2' || id == '4') ? "입력하신 주민번호는 여성입니다." : "입력하신 주민번호는 잘못된 값입니다."));

		
		sc.close();
	}
}
