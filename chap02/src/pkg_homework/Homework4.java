package pkg_homework;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		int keyCode = System.in.read();
		System.out.println(keyCode);
		
		sc.close();
	}

}
