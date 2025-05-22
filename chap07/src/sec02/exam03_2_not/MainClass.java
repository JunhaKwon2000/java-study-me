package sec02.exam03_2_not;

public class MainClass {
	public static void main(String[] args) {
		
		PaymentService p = new PaymentService();
		p.pay("card", 50000);
		System.out.println();
		
		p.pay("paypal", 50000);
		System.out.println();
		
		p.pay("bank", 50000);
		System.out.println();
		
		p.pay("matchu", 50000);
		
		
	}
	
	// overriding is a core concept in implementing polymorphism
	// using polymorphism, the method referring to the super class is actually executing the override method
	// benefits: if a new payment method is added, we don't need to change the overall structure, just override the pay() method
	
	
}
