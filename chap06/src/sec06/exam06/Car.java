package sec06.exam06;

public class Car {

	// field
	// if no particular reason, set the access modifiers of fields into private
	private int speed;
	private boolean stop;

	// method(getters and setters are usually public)
	// if there is no setter(getter exists), the field is read-only
	public int getSpeed() {
		return speed;
	}
	// customize setter method
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		}
		else {			
			this.speed = speed;
		}
	}
	
	// Quiz: Getter/Setter for field "stop"
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop) {
			speed = 0;
		}
	}
	
	
}
