package pkg_homework.homework06.controller;

import pkg_homework.homework06.model.vo.Rectangle;

public class Run {
	
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		rect1.printInfo();
		
		Rectangle rect2 = new Rectangle(3, 5);
		rect2.printInfo();
		
		
	}

}
