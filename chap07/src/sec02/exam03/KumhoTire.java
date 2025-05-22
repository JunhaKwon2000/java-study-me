package sec02.exam03;

public class KumhoTire extends Tire{

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {

		++accumulateRotation;
		
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Kumho Tire's life: " + (maxRotation - accumulateRotation) + "rounds");
			return true;
		}
		else {			
			System.out.println("!!! " + location + " Kumho Tire punked !!!");
			return false;
		}
		
		
	}
	
	
	
	

}
