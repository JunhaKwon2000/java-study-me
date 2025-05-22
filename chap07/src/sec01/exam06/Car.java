package sec01.exam06;

public class Car {
	
	// field
	public int speed;
	
	
	// method
	public void speedUp() {
		speed += 1;
	}
	
	
	// final method - can't override this method
	public final void stop() {
		System.out.println("stop the car");
		speed = 0;
	}
	
	
	
	

}
