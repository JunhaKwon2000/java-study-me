package sec02.exam04;

public class Driver {
	
	// 슈퍼 클래스의 타입으로 매개변수를 받고 있음 -> 슈퍼 클래스 및 슈퍼 클래스를 상속받고 있는 모든 객체들이 들어올 수 있다!!! -> 다형성의 핵심
	// 드라이버는 버스, 택시 모두 운전 가능함
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

	
	// 다형성을 안쓰면...?
	// if-else 문 사용으로 다양한 조건을 추가하거나
	// drive() 메소드를 여러개 만들어야 됨
	public void drive(Bus bus) {
		bus.run();
	}
	
	public void drive(Taxi taxi) {
		taxi.run();
	}
	// 단점 - 차량이 늘어날수록 메소드 오버로딩이 계속 늘어남
	// 비슷한 기능이 반복됨 -> 코드 중복, 유지보수가 어렵고 유연성이 떨어짐
	
	// 다형성의 장점(주로 1, 2에 많이 사용)
	// 1. 매개변수의 다형성
	// 예: 장바구니에 물건을 담는 기능, 물건을 구매하는 기능 등
	// void addCart(Product prod) {}
	// 2. 하나의 배열 또는 컬렉션으로 여러 종류의 객체 다루기 가능
	// 예: Vehicle[] vehicles = new Vehicle[5];
	// 3. 필드의 다형성
	// 예: 특정 이벤트(세일) 기간에만 적용할 객체, 다양한 결제 수단으로 결제를 수행할 때, 다양한 DB 다룰 때 등
	
	// => 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음
	
	
}
