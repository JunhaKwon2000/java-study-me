package pkg_homework.homework03.run;

import pkg_homework.homework03.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(new ElectricEngine());
		Car car2 = new Car(new GasolineEngine());
		
		car1.startEngine();
		car2.startEngine();
		
	}

}
