package sec01.exam03;

public class Computer extends Calculator {

	
	@Override
	double areaCircle(double r) {
		System.out.println("run areaCircle() from Computer");
		return Math.PI * r * r; // use precise PI value
	}

	// signature of method must be same to override(access modifiers with lower level of access can be used) 
//	@Override // Override annotation: check if override is successfully done when compiling  
//	private double areaCircle(double r) {
//		System.out.println("run areaCircle() from Computer");
//		return Math.PI * r * r; // use precise PI value
//	}
	
}
