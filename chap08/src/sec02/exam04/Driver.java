package sec02.exam04;

public class Driver {
	
	// 만약 매개변수로 Bus 의 인스턴스가 들어오면 해당 클래스가 가지는 고유 메서드를 호출, 그러기 위해서는 강제 타입 변환이 필요
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			// instanceOf 로 안전하게 타입 검사 후 강제 타입 변환을 수행함
			Bus b = (Bus) vehicle;
			b.checkFare();
		}
		vehicle.run();
	}

}


// 자바 신규 문법 - 검사와 동시에 강제 타입 변환
// if (vehicle instanceof Bus b) b.checkFare(); 
