package pkg_homework.homework04.run;

import pkg_homework.homework04.controller.ExMethodController;

public class Run {
	
	public static void main(String[] args) {
		
		ExMethodController ctr = new ExMethodController();
		
		ctr.printMessage("Hello World!");
		
		System.out.println();
		
		System.out.println(ctr.rangeOneToHundredSum());
		
		System.out.println();
		
		System.out.println(ctr.isEven(3));
		
		System.out.println();
		
		System.out.println(ctr.checkForAlphabet("99999123C"));
		
		System.out.println();
		
		ctr.checkForWord("bannana", 'a');
		
		System.out.println();
		
		ctr.printMultiplication(7);
		
	}
	
}
