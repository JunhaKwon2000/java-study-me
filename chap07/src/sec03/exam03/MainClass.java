package sec03.exam03;

public class MainClass {
	public static void main(String[] args) {

		PaymentService p;
		
		p = new BankTransferPayment();
		p.pay(1000);
		System.out.println();
		
		p = new CardPayment();
		p.pay(2000);
		System.out.println();
		
		p = new PaypalPayment();
		p.pay(3000);
	}
	
	
}
