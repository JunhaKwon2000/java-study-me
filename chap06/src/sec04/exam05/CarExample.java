package sec04.exam05;

public class CarExample {
	
	public static void main(String[] args) {
		// 외부에서 호출 시 객체를 만들고 참조 변수를 통해 접근해서 호출
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println(speed);
		
	}

}
