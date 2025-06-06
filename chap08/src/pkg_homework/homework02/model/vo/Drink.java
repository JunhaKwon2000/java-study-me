package pkg_homework.homework02.model.vo;

public class Drink extends Menu {
	
	// field
	private String recipe;

	// constructor
	public Drink() {
		super();
	}

	public Drink(String name, int price, String recipe) {
		super(name, price);
		this.recipe = recipe;
	}

	// method
	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	@Override
	public void cook() {
		System.out.println(super.toString() + " 레시피는 " + recipe + "입니다.");
	}

}
