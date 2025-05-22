package sec01.exam04;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		SuperSonicAirplane sp = new SuperSonicAirplane();
		
		sp.takeOff();
		sp.fly();
		sp.flyMode = SuperSonicAirplane.SUPER_SONIC;
		sp.fly();
		sp.flyMode = SuperSonicAirplane.NORMAL;
		sp.fly();
		sp.land();
		
		
	}

}
