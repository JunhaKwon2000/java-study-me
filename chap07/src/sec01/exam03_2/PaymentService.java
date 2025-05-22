package sec01.exam03_2;

// super class: common payment service -> can be made into abstract class/method
// abstract class: a common blueprint for the overall payment services
public class PaymentService {
	
	
	public void pay(int amount) {
		System.out.println("payed: " + amount);
		System.out.println("payment done.");
	}
	
	

}
