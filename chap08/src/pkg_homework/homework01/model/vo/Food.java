package pkg_homework.homework01.model.vo;

public class Food extends Product {
	
	// field
	private int expirationDays;

	// constructor
	public Food() {
		super();
	}

	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}

	// method
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		if (expirationDays <= 1) return 80;
		else if (expirationDays <= 5) return 50;
		else if (expirationDays <= 10) return 20;
		else return 0;
	}

	@Override
	public int calculatePrice() {
		return (int)(getPrice() - (getPrice() * calculateDiscountRate() / 100.0));
	}

}
