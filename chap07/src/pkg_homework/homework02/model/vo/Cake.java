package pkg_homework.homework02.model.vo;

public class Cake {
	
	// field
	private double flour;
	private double cream;
	
	// constructor
	public Cake() {}

	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}

	// method
	public double getFlour() {
		return flour;
	}
	public void setFlour(double flour) {
		this.flour = flour;
	}
	public double getCream() {
		return cream;
	}
	public void setCream(double cream) {
		this.cream = cream;
	}

	@Override
	public String toString() {
		return "밀가루 : " + flour + "(g)" + "\n크림 : " + cream + "(g)\n";
	}
	
	
	
	

}
