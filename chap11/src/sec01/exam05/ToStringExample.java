package sec01.exam05;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.toString()); // 클래스 이름@16진수 해시코드
		// 객체를 출력하려고 하면 toSring() 이 호출됨
		System.out.println(obj); // println 등 출력 문에서는 toString() 생략 가능

		
		Date date = new Date();
		// Date, String 과 같은 클래스들은 지네들이 이미 toString() 메서드를 오버라이드 해놓음, 그래서 그냥 객체를 출력해도 이상한 값이 안나오고 제대로된 값이 나오는거임
		System.out.println(date.toString()); // Date 클래스에서 날짜 정보가 나오도록 재정의 한 것
		System.out.println(date);
	}
	
}
