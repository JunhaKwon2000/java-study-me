package pkg_homework.homework01.model.vo;

public class Product {
	
	// field
	private String name;
	
	private int price;
	
	// constructor
	public Product() {}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// method
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int calculatePrice() {
		return price - (int)(price * 0.1);
	}
	
	

}
