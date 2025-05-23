package sec02.exam06;

public class MainClass {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		
		try {
			Child child = (Child) parent; // compile error - 오로지 슈퍼 타입으로 선언된 서브 클래스 객체를 서브 타입으로 캐스팅 가능
			System.out.println(child);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// 강제 타입 변환을 하기 전에 검사(안전한 코딩)
		// 검사할 객체 instanceOf 클래스 타입 -> boolean return
		
		parent = new Child();
		if (parent instanceof Child) { // parent 변수가 탐조하는 객체가 Child 타입인지 검사
			System.out.println("캐스팅 가능");
			Child child = (Child) parent;
			System.out.println(child);
		}
		else System.out.println("캐스팅 불가능");
		
		// 자바 12부터 추가된 문법
		// instanceOf 의 결과가 true 일 경우 자동 타입 변환되어 변수에 대입
		if (parent instanceof Child child) { // parent 변수가 탐조하는 객체가 Child 타입인지 검사
			System.out.println(child);
		}
		else System.out.println("캐스팅 불가능");
		
		
		Parent parentA = new Child();
		method1(parentA);
		Parent parentB = new Parent();
		method1(parentB);
		
		
	}
	
	
	
	public static void method1(Parent parent) {
		// 안전하게 타입 검사 후 변환하기
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println(child);
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("변환 불가능");
		}
		
		
	}
	
}
