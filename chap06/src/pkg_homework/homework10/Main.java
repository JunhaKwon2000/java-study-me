package pkg_homework.homework10;

public class Main {

	public static void main(String[] args) {
		
		Account ac1 = new Account("123-456-789", 100000);
		Account ac2 = new Account("987-654-321", 50000);
		
		ac1.withdraw(30000);
		ac2.deposit(100000);
		
		
		Bank bank = new Bank();
		bank.transfer(ac1, ac2, 50000);
		
		System.out.println(ac1.getBalance());
		System.out.println(ac2.getBalance());
		

	}

}
