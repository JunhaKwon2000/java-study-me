package sec03.exam03;

public class Car {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자(오버로드)
	public Car() {}


	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 총 4개의 생성자 오버로딩
	// 주의: 매개변수 이름만 바꾸는 것은 오버로딩이 아님(타입이 중요!)
	
	// Quiz: 오버로딩 가능?
//	public Car(String model, int maxSpeed, String color) {
//		this.model = model;
//		this.maxSpeed = maxSpeed;
//		this.color = color;
//	}
	// 답: 가능!(타입의 조합이 같아도 순서가 다르면 성립!)
}
