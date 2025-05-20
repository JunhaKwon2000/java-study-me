package sec03.exam04;

public class Car {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자
	public Car() {}


	public Car(String model) {
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
		this(model, "은색", 250); // 3개짜리 생성자 호출
	}

	public Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
		this(model, color, 250); // 3개짜리 생성자 호출
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	// this() 생성자를 사용하면 큰 생성자 하나만 만들고 커스텀 생성자는 그 큰 생성자를 호출해서 사용함
	// this() 는 무조건 생성자의 첫줄(아니면 compile error)
	// 코드를 컴팩트하게 할 수 있음!
	
	// 정리: 중복된 필드 초기화 코드가 하나의 생성자에 집중되어, 유지보수와 가독성에 좋음
}
