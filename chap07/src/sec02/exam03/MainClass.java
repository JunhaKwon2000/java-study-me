package sec02.exam03;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		
		for (int i = 1; i <= 5; i++) { 
			int problemLocation = car.run(); // rotate the four tires once
			
			
			switch(problemLocation) {
				
			case 1 : 
				System.out.println("Replace front-left tire to Hankook Tire");
				car.frontLeftTire = new HankookTire(15, "front-left");
				break;
			case 2 : 
				System.out.println("Replace front-right tire to Kumho Tire");
				car.frontRightTire = new KumhoTire(13, "front-right");
				break;
			case 3 : 
				System.out.println("Replace back-left tire to Hankook Tire");
				car.backLeftTire = new HankookTire(14, "back-left");
				break;
			case 4 : 
				System.out.println("Replace back-right tire to Kumho Tire");
				car.backRightTire = new KumhoTire(17, "back-right");
				break;
			}
			
			System.out.println("===========================================");
		}
		
	}
	
}
