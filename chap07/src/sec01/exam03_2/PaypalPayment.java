package sec01.exam03_2;

public class PaypalPayment extends PaymentService {
	
	@Override
	public void pay(int amount) {
		System.out.println("paypal selected.");
		System.out.println("checking paypal account...");
		System.out.println("payed: " + amount);
		System.out.println("payment done.");
	}
}
