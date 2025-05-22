package sec01.exam04;

// has the traits of an Airplane, and add only the functions for super sonic flight
public class SuperSonicAirplane extends Airplane {
	
	// constant(static final) flight mode
	public static final int NORMAL = 1;
	public static final int SUPER_SONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPER_SONIC) {
			System.out.println("GOING SUPER SONIC!!!");
		}
		else {
			// System.out.println("flying high..."); // duplicate code if it is the same with super class's method
			super.fly(); // call super classs's fly() - better code, used when we need to maintain parts of the super's method
		}
	}
	
	
	
	
}
