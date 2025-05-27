package pkg_homework.homework02.run;

import pkg_homework.homework02.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Menu[] menus = new Menu[5];
		
		int[] price = {10000, 15000, 20000};
		String[] dishName = {"칼국수", "뼈해장국", "스파게티"};
		String[] ingredientsArray = {"밀가루", "돼지", "토마토"};
		String[] drinkName = {"아이스티", "레몬티", "녹차"};
		String[] recipeArray = {"아이스티 레시피", "레몬티 레시피", "녹차 레시피"};
		
		for (int i = 0; i < menus.length; i++) {
			int choice1 = (int)(Math.random() * 2);
			if (choice1 == 1) {
				int choice2 = (int)(Math.random() * 3);
				menus[i] = new Dish(dishName[choice2], price[choice2], ingredientsArray[choice2]);
			}
			else {
				int choice2 = (int)(Math.random() * 3);
				menus[i] = new Drink(drinkName[choice2], price[choice2], recipeArray[choice2]);
			}
		}
		
		for (Menu menu : menus) menu.cook();
		
		
		
	}

}
