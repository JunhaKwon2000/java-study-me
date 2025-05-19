package sec03.exam01;

public class CarExample {
	public static void main(String[] args) {
		
		// Car car = new Car(); // 컴파일 에러, 기본 생성자가 선언되지 않음

		// 우리가 선언한 커스텀 생성자를 사용하세요
		Car car = new Car("검정", 3000);
		System.out.println(car.color);
		System.out.println(car.cc);
		
	}
}
