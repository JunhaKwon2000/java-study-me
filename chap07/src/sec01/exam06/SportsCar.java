package sec01.exam06;

public class SportsCar extends Car {

	// method
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// compile error - can't override the final method
	// if you want to prevent the "common" method(from super) from accidently overridden from a subclass, use the final keyword 
//	@Override
//	public void stop() {
//		System.out.println("stop sports car");
//		speed = 0;
//	}	

	
	
	
	
	
}
