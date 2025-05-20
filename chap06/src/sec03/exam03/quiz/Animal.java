package sec03.exam03.quiz;

public class Animal {

//	Quiz
//	실행 클래스를 실행 한 경우 오류가 발생하지 않고, 
//	출력 결과가 나오도록 Animal 클래스를 구현하시오.
//	(단, 필드에 초기값을 넣지 말고 생성자에서만 초기화 할 것!)
//	
//  [필드]
//	kind: 문자열
//	age: 정수
//	
//	[출력]
//	원숭이: 26살
//	사자: 1살
//	사람: 100살
	
	String kind;
	int age;
	
	
	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

	public Animal(String kind) {
		this.kind = kind;
		this.age = 1;
	}

	public Animal(int age) {
		this.kind = "사람";
		this.age = age;
	}

	// 출력 메소드
	void info() {
		System.out.println(kind + ": " + age + "살");
	}
	
}
