package sec01.exam03;

import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		
		int score = 67;
		
		if (score >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else if (score >= 80) { // score >= 80 and < 90
			System.out.println("점수가 80 ~ 89점 사이입니다."); // {} 생략시 이 친구만 else 로 바인딩됨(다음 실행문 한개)
			System.out.println("등급은 B 입니다.");
		}
		else if (score >= 70) { // score >= 70 and < 80
			System.out.println("점수가 70 ~ 79점 사이입니다."); // {} 생략시 이 친구만 else 로 바인딩됨(다음 실행문 한개)
			System.out.println("등급은 C 입니다.");
		}
		else { // score < 70
			System.out.println("점수가 70점 미만입니다."); // {} 생략시 이 친구만 else 로 바인딩됨(다음 실행문 한개)
			System.out.println("등급은 D 입니다.");
		}
		
		// 정리(else if)
		// 1. 조건식을 여러 개 작성할 수 있다.(개수 제한 X)
		// 2. 조건식이 true 가 되는 블록만 실행하고 if 문을 빠져나감(switch 문과의 차이점)
		
		// Quiz
//		한 개의 문자를 입력받아
//		대문자, 소문자, 숫자, 기타문자인지를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		  A  => 대문자
//		  a  => 소문자
//		  0  => 숫자
//		  가  => 기타문자
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		char inputChar = scanner.nextLine().charAt(0);
		
		int unicode = inputChar; // 이거 안하고 그냥 'A' 이상 'Z' 이하 이렇게도 가능(연산할 때 어차피 integer 로 변환됨)
		
		if (unicode >= 65 && unicode <= 90) {
			System.out.println("대문자");
		}
		else if (unicode >= 97 && unicode <= 122) {
			System.out.println("소문자");
		}
		else if (unicode >= 48 && unicode <= 57) {
			System.out.println("숫자");
		} 
		else {
			System.out.println("기타문자");
		}
		
		scanner.close();
	}
}
