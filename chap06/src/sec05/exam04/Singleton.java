package sec05.exam04;

public class Singleton {
	
	
	// Step 2
	// use private modifier to block modifying from outside
	// use this object only
	private static final Singleton SINGLETON = new Singleton();
	
	// Step 1
	// use private modifier to block access from exterior(no private => multiple objects can be created from outside of the class)
	private Singleton() {} // blocks creating objects using "new"

	// Step 3
	public static Singleton getInstance() {
		return SINGLETON; // return object itself
	}	

}
