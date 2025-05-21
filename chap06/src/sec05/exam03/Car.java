package sec05.exam03;

public class Car {

	// field 
	int speed;
	
	
	// method
	void run() { System.out.println(speed + "으로 달립니다."); }
	
	
	// method(static)
	static void test() {
		// can't use instance field, method, this
		// speed = 10; // compile error
		// run(); // compile error
		
		// if you want to use instance members(NOT RECOMMENDED)
		// if you want to use instance members, just use instance members, not static
		Car obj = new Car();
		obj.speed = 60;
		obj.run();
	}
	
	public static void main(String[] args) {
		
		
		test();
		
	}
	
}
