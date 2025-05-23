package sec03.exam03;

// sub class: bank transfer
public class BankTransferPayment extends PaymentService {

	@Override
	public void pay(int amount) {
		System.out.println("bank transfer selected.");
		System.out.println("checking virtual account...");
		System.out.println("payed: " + amount);
		System.out.println("payment done.");
	}

	
	
}
