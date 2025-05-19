package pkg_homework;

import java.util.Scanner;

public class Homework03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int a = sc.nextInt();
		
		while (true) {
				
			if (a % 2 == 0 || a < 3) {
				System.out.println("다시 입력하세요.");
				System.out.print("정수 : ");
				a = sc.nextInt();
			} 
			else break;
			
		}
		
		int[] arr = new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			if (i <= (arr.length / 2) - 1) {
				arr[i] = (i + 1);
			}
			else if (i >= arr.length - (arr.length / 2)) {
				arr[i] = arr.length - i;
			}
			else {
				arr[i] = arr.length / 2 + 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) System.out.print(", ");
		}
		
		sc.close();
		
		
	}

}
