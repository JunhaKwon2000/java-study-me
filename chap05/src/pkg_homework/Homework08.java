package pkg_homework;

import java.util.Arrays;

public class Homework08 {

	public static void main(String[] args) {
		
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		String[] menuCopy = Arrays.copyOf(menu, menu.length + add.length);
		
		for (int i = menu.length; i < menuCopy.length; i++) {
			menuCopy[i] = add[i - (menu.length)];
		}
		
		
		System.out.print("어제 메뉴판: ");
		for (int i = 0; i < menu.length; i++) {
			System.out.print(menu[i]);
			if (i != menu.length - 1) System.out.print(", ");
		}
		
		System.out.println();
		
		System.out.print("오늘 메뉴판: ");
		for (int i = 0; i < menuCopy.length; i++) {
			System.out.print(menuCopy[i]);
			if (i != menuCopy.length - 1) System.out.print(", ");
		}
		
		
		
		
		
		
	}
	
	
	
}
