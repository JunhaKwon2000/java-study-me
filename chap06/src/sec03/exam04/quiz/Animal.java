package sec03.exam04.quiz;

public class Animal {

	//	Quiz
	//  다른 생성자를 호출하는 this()를 써서 리팩토링 해보세요.
	
	String kind;
	int age;
	
	
	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}

	public Animal(String kind) {
		this(kind, 1);
	}

	public Animal(int age) {
		this("사람", age);
	}

	void info() {
		System.out.println(kind + ": " + age + "살");
	}
	
}
