package pkg_homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		
		// 에러나 예외 case 를 먼저 검사하고 처리한 다음, 성공 case 는 마지막에 처리하는 구조 = Early Return
		// 장점: 코드의 가독성이 좋아짐, 코드의 중첩을 줄일 수 있음
		// 이 경우 if(month < 1 || month > 12) 이런식으로 해야함
		
		if (month == 3 || month == 4 || month == 5) System.out.println("봄");
		else if (month == 6 || month == 7 || month == 8) {
			if (temp >= 33) {
				if (temp >= 35) {
					System.out.println("여름 폭염 경보");
				}
				else {
					System.out.println("여름 폭염 주의보");					
				}
			}
		}
		else if (month == 9 || month == 10 || month == 11) System.out.println("가을");
		else if (month == 12 || month == 1 || month == 2) {
			if (temp <= -12) {
				if (temp <= -15) {
					System.out.println("겨울 한파 경보");
				}
				else {
					System.out.println("겨울 한파 주의보");					
				}
			}
		}
		else System.out.println("해당하는 계절이 없습니다.");
		
		sc.close();

	}
}
