package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		
		// char(2Byte) - 하나의 문자를 유니코드(세계의 문자들을 2Byte 범위에 맵핑한 국제 표준 규약)로 저장
		char c1 = 'A'; // 유니코드 65 저장
		char c2 = 65; // 양의 정수값(0~65535)
		char c3= '\u0041'; // 16진수
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// 유니코드 알아내기
		char c7 = '각';
		System.out.println((int)c7); // 타입 변환
		
		char c8 = 'A'; 
		System.out.println(c8 + 1); // char 변수가 산술 연산에 쓰이면 integer 형으로 먼저 변환됨
		
		char c9 = 'A' + 1;
		System.out.println(c9);
		
		System.out.println('1' - 0); // 49 - 0
		System.out.println('1' - '0'); // 49 - 48, 
		
		// 문자를 숫자로 변환할 때 - '0' 을 해주세요
		char digit = '8';
		int c10 = digit - '0';
		System.out.println(c10);
		
		/*
		 * 1. 문자(char)와 문자열(String)은 다른 개념
		 * 2. empty 문자는 compile error, 공백(유니코드 32)은 가능, String 은 empty 문자 저장 가능
		 */
		
		// char c11 = ''; // compile error - Invalid character constant
		char c12 = ' ';
		System.out.println(c12);
		
		String c13 = "";
		System.out.println(c13);
	}

}
