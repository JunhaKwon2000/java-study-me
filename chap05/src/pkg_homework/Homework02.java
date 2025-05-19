package pkg_homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int v = sc.nextInt();
			arr[i] = v;
			sum += arr[i];
		}
		
		for (int items : arr) System.out.print(items + " ");
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		sc.close();
		
		
	}
}
