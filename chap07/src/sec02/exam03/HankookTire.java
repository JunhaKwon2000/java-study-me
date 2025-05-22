package sec02.exam03;

public class HankookTire extends Tire {

	
	
	
	// constructor
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	
	
	
	// method
	@Override
	public boolean roll() {
		
		++accumulateRotation;
		
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Hankook Tire's life: " + (maxRotation - accumulateRotation) + "rounds");
			return true;
		}
		else {			
			System.out.println("!!! " + location + " Hankook Tire punked !!!");
			return false;
		}
		
		

	}
	
	

	
	
	
}
