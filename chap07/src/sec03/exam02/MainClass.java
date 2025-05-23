package sec03.exam02;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal cat = new Cat("포유류");
		Animal dog = new Dog("포유류");
		
		System.out.println(cat.kind);
		System.out.println(dog.kind);
		
		System.out.println();
		
		cat.breathe();
		dog.breathe();
		
		System.out.println();
		
		cat.sound();
		dog.sound();
		
		System.out.println();
		
		Animal[] animals = new Animal[2];
		animals[0] = cat;
		animals[1] = dog;
		
		for (Animal animal : animals) animal.sound();
		
		// -----------------------
		// 변수의 자동 타입 변환(필드의 다형성)
		System.out.println();
		
		Animal instance = null;
		instance = new Dog("포유류"); // 자식 객체를 부모 타입에 대입
		instance.sound();
		instance = new Cat("포유류");
		cat.sound();
		System.out.println();
		
		// 매개변수의 자동 타입 변환(배개변수의 다형성)
		animalSound(cat);
		animalSound(dog);
		
		// 추상 클래스의 용도
		// 1. 설계 규격을 만들고자 할 때
		// 반드시 존재해야 할 공통 필드와 메소드의 선언(특히, 추상 메소드는 구현을 강제할 수 있음)
		// 2. 실체 클래스를 작성할 때 시간 절약
		// 공통된 내용은 물려받고, 추가적인 필드와 메소드만 선언
		// 3. 공통 필드와 메소드의 이름을 통일할 목적
		// 실체 클래스의 설계자가 여러 사람일 경우, 제각기 다른 이름을 가질 수 있음을 방지
		
		// 정리: 
		// 공통 기능 제공 + 규격 정의
		// 설계 규격을 명확하게 정의하고, 일부 공통 기능까지 제공하고 싶다면 추상 클래스
		
		// 참고로 인터페이스는 순수한 설계 규격 정의
		// 설계 규격만 정의하고, 다중 구현이 필요 하다면 인터페이스
		
	}
	
	// 매개변수의 자동 타입 변환(배개변수의 다형성)
	// static 을 붙이는 이유? -> 메인 메서드가 static 인데 static 메서드에서 인스턴스 메서드를 쓴다는 것 자체가 말이 안됨(좀만 생각해보면 되 static 은 엄청 빨리 올라가자나 메모리에)
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
