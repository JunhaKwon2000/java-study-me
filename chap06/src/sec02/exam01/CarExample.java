package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		// 클래스 외부(다른 클래스)에서의 필드 사용
		// => 객체를 생성한 뒤 해당 객체에 접근하여 사용
		// 필드는 객체의 데이터이기 때문에 객체 없이는 쓸 수 없음
		
		Car car = new Car();
		
		
		System.out.println("회사 : " + car.company); // 도트(.) 연산자, 객체 접근 연산자
		System.out.println("모델 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("최고 속도 : " + car.maxSpeed + "km/h");
		System.out.println("현재 속도 : " + car.speed + "km/h"); // 초기값이 없으므로 integer 의 기본값 0 이 들어감
		
		car.speed = 60;
		System.out.println("현재 속도 : " + car.speed + "km/h");
		
		
		
		
	}
	
}
