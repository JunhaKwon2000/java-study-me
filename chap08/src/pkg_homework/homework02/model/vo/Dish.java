package pkg_homework.homework02.model.vo;

public class Dish extends Menu {

	// field
	private String ingredients;

	// constructor
	public Dish() {
		super();
	}

	public Dish(String name, int price, String ingredients) {
		super(name, price);
		this.ingredients = ingredients;
	}

	// method
	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public void cook() {
		System.out.println(super.toString() + " 재료는 " + ingredients + "입니다.");
	}
	
}
