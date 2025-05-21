package pkg_homework.homework10;

public class Bank {
	
	public void transfer(Account a, Account b, int amount) {
		a.withdraw(amount);
		b.deposit(amount);
	}

}
