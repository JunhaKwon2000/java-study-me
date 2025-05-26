package sec02.exam02;

public class Driver {
	
	// method
	// 매개변수를 인터페이스 타입으로 선언해 해당 인터페이스를 구현한 객체가 들어올 수 있음(느슨한 결합)
	public void runVehicle(Vehicle vehicle) {
		vehicle.run(); // 인터페이스를 구현한 객체의 오버라이드된 메서드가 호출됨, 객체가 바뀌어도 메서드 사용법은 바뀌지 않는 것이 장점임
	}

}
