package pkg_homework.homework03;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine();
		
		email = email.trim();
		
		String emailHeader = email.substring(0, email.indexOf("@"));
		String emailTail = email.substring(email.indexOf("@") + 1);
		
		if (emailTail.endsWith("goodee.co.kr")) System.out.println("아이디 : " + emailHeader.toUpperCase());
		else System.out.println("유효하지 않은 이메일입니다.");

		sc.close();
		
	}

}
