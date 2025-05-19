package sec03.exam01;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	int cc;
	

	// 생성자
	// public Car() {}
	
	public Car(String color, int cc) {
		this.color = color;
		this.cc = cc;
		System.out.println(color + "색의 " + cc + "cc 자동차가 생성됨.");
	}
	
}
