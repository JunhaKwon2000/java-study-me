package pkg_homework;
import java.util.Scanner;


public class Homework6 {

	public static void main(String[] args) {
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		
		String b = a + "";
		
		int c = Integer.parseInt(b);
		
		System.out.println("입력한 숫자의 제곱은 " + c*c + "입니다.");
		sc.close();
	}

}
