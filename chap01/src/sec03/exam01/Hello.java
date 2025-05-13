// 각자 테마 변경 및 글자 크기 조정
// Windows > Preferences
// 단축키: ctrl + or -

// 한줄 주석

/*
 * 여러 
 * 줄 주석 
 */

/** 
 * 도큐먼트 주석 - 도큐먼트 문서 생성시 사용
 */

package sec03.exam01; // 패키지 선언 - source file 이 해당 패키지 밑에 있음

public class Hello { // 클래스 선언 - 대문자로 시작, source file 이름과 동일해야함

	public static void main(String[] args) { // main 메소드 선언 - 프로그램 실행 진입점(자바 프로그램 실행 시 가장 먼저 실행되는 메소드)
		System.out.println("Hello World!"); // 실행 코드 - 실행할 코드
		
		// 저장할 때마다 자동으로 컴파일됨, 에러 있을 시 빨간줄 발생
		
		System.out.println("Hello // /**/ World!"); // 문자열 내부 주석 X
	}

}