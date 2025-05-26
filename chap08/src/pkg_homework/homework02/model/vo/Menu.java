package pkg_homework.homework02.model.vo;

public abstract class Menu {

	// field
	private String name;
	
	private int price;

	// constructor
	public Menu () {}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// method
	@Override
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "원입니다.";
	}
	
	public abstract void cook();
	
	
	
	
	
	
}
