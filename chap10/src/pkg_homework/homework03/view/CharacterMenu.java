package pkg_homework.homework03.view;

import java.util.Scanner;

import pkg_homework.homework03.controller.CharacterController;
import pkg_homework.homework03.exception.CharCheckException;

public class CharacterMenu {

	// method
	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		
		System.out.print("문자열 : ");
		String s = sc.nextLine();
		
		try {
			int result = cc.countAlpha(s);
			System.out.println("`" + s + "`에 포함된 영문자 개수 : " + result);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
	
	
}
