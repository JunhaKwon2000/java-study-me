package sec02.exam02;

public class MainClass {
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		d.runVehicle(new Bus());
		d.runVehicle(new Taxi());
		
	}

}
