package pkg_homework.homework02.view;

import java.util.Scanner;

import pkg_homework.homework02.controller.*;

public class CakeMenu {

	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaController gtc = new GreenTeaController();
	
	public void mainMenu() {
		System.out.println("어떤 케이크를 만드시겠습니까?");
		System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
		System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
		System.out.println("9. 취소");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		if (choice == 1) chocolateMenu();
	}
	
	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		System.out.print("밀가루(g) : ");
		int chip = sc.nextInt();
		System.out.println("밀가루 : " + flour + "(g)");
		System.out.println("크림 : " + cream + "(g)");
		System.out.println("체리 : " + cherry + "(개)");
		System.out.println("초콜릿 칩 : " + chip + "(개)");
		String str = cc.bakeChocolateCake(flour, cream, cherry, chip);
		System.out.println(str);
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		System.out.print("밀가루(g) : ");
		int chip = sc.nextInt();
		System.out.println("밀가루 : " + flour + "(g)");
		System.out.println("크림 : " + cream + "(g)");
		System.out.println("체리 : " + cherry + "(개)");
		System.out.println("초콜릿 칩 : " + chip + "(개)");
		String str = cc.bakeChocolateCake(flour, cream, cherry, chip);
		System.out.println(str);

	}
	
	
	
	
}
