package sec03.exam02;

// 이 예제에서는 공통 기능 제공 + 하위 클래스가 나머지를 구현하도록 강제
public abstract class Animal {
	
	// field
	public String kind;
	
	// constructor
	public Animal(String kind) {
		this.kind = kind;
	}

	// method
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	

	// 추상 메서드
	// 미완성 메서드, 실행부(몸통, {})가 없는 메서드
	// 추상 클래스 안에서만 정의 가능
	// 꼭 필요하지만 자식마다 다르게 구현될 것으로 예상되는 경우 사용
	// 반드시 서브 클래스는 이걸 구현해야함!!!
	public abstract void sound();
	
}
