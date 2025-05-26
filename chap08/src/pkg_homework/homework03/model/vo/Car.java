package pkg_homework.homework03.model.vo;

public class Car {
	
	// field
	private Engine engine;

	// constructor
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	// method
	public void startEngine() {
		engine.start();
	}
	

}
