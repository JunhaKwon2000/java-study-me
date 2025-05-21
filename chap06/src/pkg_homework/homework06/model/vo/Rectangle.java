package pkg_homework.homework06.model.vo;

public class Rectangle {
	
	// field
	private int width;
	private int height;
	
	// method
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int calculateRound() {
		return 2 * (width + height);
	}
	
	public int calculateArea() {
		return width * height;
	}
	
	public void printInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레");
		System.out.println(calculateRound() + "cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(calculateArea() + "cm");
	}
	
	

}
