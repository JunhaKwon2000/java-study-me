package sec01.exam04.quiz;

public class Run {

	public static void main(String[] args) {
		
		Actionable[] robot = new Actionable[3];
		
		robot[0] = new DanceRobot();
		robot[1] = new SingRobot();
		robot[2] = new DrawRobot();
		
		for (Actionable r : robot) {
			r.action(); 
		}
	}
		
		
}
