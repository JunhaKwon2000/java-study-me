package sec01.exam03_2;

public class CardPayment extends PaymentService {
	
	
	@Override
	public void pay(int amount) {
		System.out.println("credit card selected.");
		System.out.println("card validation in progress...");
		System.out.println("payed: " + amount);
		System.out.println("payment done.");
	}

}
