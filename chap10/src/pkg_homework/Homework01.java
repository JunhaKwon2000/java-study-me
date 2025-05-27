package pkg_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int magicNumber = (int)(Math.random() * 50) + 1;
		int cnt = 0;
		
		while(true) {
			
			try {
				System.out.print("1~50 사이의 숫자 : ");
				int num = sc.nextInt();
				if (num > magicNumber) {
					System.out.println("Down!");
					cnt++;
				}
				else if (num < magicNumber) {
					System.out.println("Up!");
					cnt++;
				}
				else {
					System.out.println("축하합니다~ 정답이에요(" + (cnt + 1) + "회 시도)");
					break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine(); // 버리기
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
			}
			
		}
		
		sc.close();
		
	}

}
