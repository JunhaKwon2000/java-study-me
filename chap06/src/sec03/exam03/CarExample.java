package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("==car1==");
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("그랜져");
		System.out.println("==car2==");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println();
		
		System.out.println("==car3==");
		Car car3 = new Car("그랜져", "흰색");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		System.out.println();
		
		System.out.println("==car4==");
		Car car4 = new Car("그랜져", "흰색", 300);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		
		
	}
	
}
