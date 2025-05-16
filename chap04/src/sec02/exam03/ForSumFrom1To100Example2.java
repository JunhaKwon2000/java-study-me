package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0; // main method global variable
		
		// sum 1 ~ 100
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ " + (i - 1) + " 합: " + sum);
		
		
		// infinite loop
		// example: 특정 조건을 만족하면 멈추도록
		int cnt = 0;
		for (; ;) {
			System.out.println("infinite");
			cnt++;
			if (cnt >= 6) break;
		}
		
		// Quiz: 1 부터 100까지 짝수의 합
		int evenSum = 0;
		for (int j = 0; j <= 100; j++) {
			if (j % 2 == 0) evenSum += j;
		}
		System.out.println(evenSum);
		
		
		System.out.println("==============================");
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = sc.nextInt();
		int evenOddSum = 0;
		
		if (number % 2 == 0) {
			for (int k = 2; k <= number; k++) {
				if (k % 2 == 0) evenOddSum += k;
			}	
		}
		else {
			for (int k = 1; k <= number; k++) {
				if (k % 2 == 0) continue;
				evenOddSum += k;
			}
		}
		
		System.out.println(evenOddSum);
		
		sc.close();
	}
}
