package pkg_homework.homework03.run;

import pkg_homework.homework03.util.Util;

public class MainClass {

	public static void main(String[] args) {
		
		Util util = new Util();
		
		String result1 = util.concat("apple ", "delicious");
		System.out.println(result1);
		
		System.out.println();
		
		int result2 = util.conditionalMultiply(2, 4);
		System.out.println(result2);
		
		System.out.println();
		
		int result3 = util.conditionalMultiply(4, 2);
		System.out.println(result3);
		
		System.out.println();
		
		boolean result4 = util.compareString("apple", "apple");
		System.out.println(result4);

	}

}
