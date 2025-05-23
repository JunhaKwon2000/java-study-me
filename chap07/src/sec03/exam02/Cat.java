package sec03.exam02;

public class Cat extends Animal {
	
	public Cat(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("야용~~");
	}

}
