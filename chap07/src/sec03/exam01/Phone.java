package sec03.exam01;

// 추상 클래스
// 미완성 설계도 (추상 메서드를 가지고 있는 클래스)
// 공통 설계도(공통 특성을 모아놓은 클래스)
// 공통 기능을 일부 구현해놓고, 하위 클래스가 나머지를 구현하도록 할 때)
// 장점: 코드 중복 줄이고, 공통 처리 로직을 강제할 수 있다

// 이 예제에서는 공통 기능만 제공
// 근데 이렇게 공통 기능만 제공하는데 굳이굳이 abstract 를 붙여야할까..?
// 의도가 명확해지는 느낌 -> 인스턴스화 목적이 아니라는 의도가 명확
// 실수로 불필요한 인스턴스화를 방지하고 상속을 통해서만 쓰겠다는 의미
public abstract class Phone {
	// new 연산자로는 생성 불가, 예를 상속 받는 친구들을 만들어야함
	// 폰들의 공통된 특성을 작성함
	
	// field
	public String owner;
	
	// constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// method
	public void turnOn() {
		System.out.println("ON");
	}
	
	public void turnOff() {
		System.out.println("OFF");
	}
	
	
}
