package pkg_homework.homework02.model.vo;

public class Chocolate extends Cake {
	
	// field
	private int cherry;
	private int chip;
	
	// constructor
	public Chocolate() {}

	public Chocolate(double flour, double cream, int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}

	// method
	public int getCherry() {
		return cherry;
	}

	public void setCherry(int cherry) {
		this.cherry = cherry;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {	
		return super.toString() + "체리 : " + cherry + "(개)" + "\n초콜릿 칩 : " + chip + "(개)\n초콜릿 케이크가 완성되었습니다.";
	}
	
	
	

}
