package sec02.exam03_2_not;

// super class: common payment service -> can be made into abstract class/method
// abstract class: a common blueprint for the overall payment services
public class PaymentService {
	
	
	public void pay(String type, int amount) {
		if ("card".equals(type)) {
			System.out.println("credit card selected.");
			System.out.println("card validation in progress...");
			System.out.println("payed: " + amount);
			System.out.println("payment done.");
		}
		else if ("paypal".equals(type)) {
			System.out.println("paypal selected.");
			System.out.println("checking paypal account...");
			System.out.println("payed: " + amount);
			System.out.println("payment done.");
		}
		else if ("bank".equals(type)) {
			System.out.println("bank transfer selected.");
			System.out.println("checking virtual account...");
			System.out.println("payed: " + amount);
			System.out.println("payment done.");
		}
		else {
			System.out.println("지원하지 않는 결제 수단입니다.");
		}
		
		// drawbacks
		// if a new payment is added, we need to keep updating the if-else or switch code -> not recommended
		// not oop, maintenance is too hard..
		
		
		// if you use polymorphism
		// you can just add the sub class and override it if a new payment adds
		// changing only the object achieves changing the functionality
		// better readable code
	}
	
	

}
