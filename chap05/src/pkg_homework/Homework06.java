package pkg_homework;

import java.util.Scanner;
import java.util.Arrays;

public class Homework06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int N = sc.nextInt();
		String[] arr = new String[N];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			String v = sc.next();
			arr[i] = v;
		}
		
		while (true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String choice = sc.next();
			
			if ("Y".equals(choice) || "y".equals(choice)) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int plus = sc.nextInt();
				int initIdx = arr.length;
				arr = Arrays.copyOf(arr, initIdx + plus);
				for (int i = initIdx; i < arr.length; i ++) {
					System.out.print((i + 1) + "번째 문자열 : ");
					String v = sc.next();
					arr[i] = v;
				}
			}
			else if ("N".equals(choice) || "n".equals(choice)) {
				break;
			}
			else {
				System.out.println("입력할 수 없는 값입니다.");
			}
			
			
			
			
			
			
		}
		
		
		
		for (String items : arr) System.out.println(items);
		sc.close();
		
	}

}
