package sec01.exam03_2;

public class MainClass {
	public static void main(String[] args) {
		
		
		PaymentService p1 = new PaymentService();
		PaymentService p2 = new BankTransferPayment();
		PaymentService p3 = new CardPayment();
		PaymentService p4 = new PaypalPayment();
		
		p1.pay(10000);
		System.out.println();
		p2.pay(10000);
		System.out.println();
		p3.pay(10000);
		System.out.println();
		p4.pay(10000);
		
		System.out.println();
		
		PaymentService p;
		p = new PaymentService();
		p.pay(1000);
		System.out.println();
		
		p = new BankTransferPayment();
		p.pay(1000);
		System.out.println();
		
		p = new CardPayment();
		p.pay(1000);
		System.out.println();
		
		p = new PaypalPayment();
		p.pay(1000);
	}
	
	// overriding is a core concept in implementing polymorphism
	// using polymorphism, the method referring to the super class is actually executing the override method
	// benefits: if a new payment method is added, we don't need to change the overall structure, just override the pay() method
	
	
}
