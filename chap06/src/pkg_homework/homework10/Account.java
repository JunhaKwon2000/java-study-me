package pkg_homework.homework10;

public class Account {

	// field
	private String accountNumber;
	private int balance;
	
	
	// constructor
	public Account() {}

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	// method
	public String getAccountNumber() {
		return accountNumber;
	}
		
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
	
}
