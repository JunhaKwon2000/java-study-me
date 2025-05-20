package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		// 현재 초기 gas 값음? 기본값 0
		
		car.checkGas();
		car.setGas(5);
		boolean gasState = car.checkGas();
		if (gasState) {
			System.out.println("출발합니다!");
			car.runCar();			
		}
		
		if (car.checkGas()) {
			System.out.println("gas 주입 필요 없음");
		}
		else {
			System.out.println("gas 주입 필요 있음.");
		}
		
		
	}
	
}
