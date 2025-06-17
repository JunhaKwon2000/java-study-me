package sec02.exam04;

public class MainClass {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		d.drive(new Bus());
		System.out.println();
		d.drive(new Taxi());
		// 이클립스 -> 인텔리제이 이식 테스트
		
	}
	
}
