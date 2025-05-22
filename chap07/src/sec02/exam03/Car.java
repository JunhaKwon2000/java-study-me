package sec02.exam03;

public class Car {
	
	// field - Declare all field with super class to achieve polymorphism
	Tire frontLeftTire = new Tire(6, "front-left");
	Tire frontRightTire = new Tire(2, "front-right");
	Tire backLeftTire = new Tire(3, "back-left");
	Tire backRightTire = new Tire(4, "back-right");
	
	// method
	// rotate each of the tires once
	// return what number of tire is punked
	
	
	public int run() {
		
		System.out.println("[Car is running...]");
		
		// result(roll()) differs from what object you are referring to => polymorphism
		if (frontLeftTire.roll() == false) { stop(); return 1; }
		if (frontRightTire.roll() == false) { stop(); return 2; }
		if (backLeftTire.roll() == false) { stop(); return 3; }
		if (backRightTire.roll() == false) { stop(); return 4; }
		return 0;
		
	}
	
	
	public void stop() {
		System.out.println("[Car stopped running...]");
	}
	

}
