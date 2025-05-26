package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
	
		Animal animal = new Dog();
		
		Dog dog = (Dog) animal;
		System.out.println(dog);
		
		// Cat cat = (Cat) animal; // 예외 - CCE
		// System.out.println(cat);
		
		System.out.println();
		
		changeDog(new Dog());
		changeDog(new Cat());
		
	}
	
	public static void changeDog(Animal animal) {
		// 예외 막으려면 안전하게 타입 검사 후 강제 타입 변환 진행
		if (animal instanceof Dog d) System.out.println(d);
		else System.out.println(animal);
	}

}


// 클래스 여러개 만들 수 있지만, public 클래스는 하나만 가능, 이렇게 안함(한 .java 파일 안에 하나의 클래스만 있는 것이 원칙)
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}