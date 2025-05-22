package sec02.exam03;

public class Tire {

	// field
	public int maxRotation; // maximum rotation (life)
	public int accumulateRotation; // accumulated rotation (== maxRotation - > tire boom!)
	public String location; // location of the tire
	
	// constructor
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	// method
	
	// rotate tire once
	public boolean roll() {
		
		++accumulateRotation;
		
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire's life: " + (maxRotation - accumulateRotation) + "rounds");
			return true;
		}
		else {			
			System.out.println("!!! " + location + " Tire punked !!!");
			return false;
		}
		
	} 
}
