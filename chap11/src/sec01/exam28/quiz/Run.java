package sec01.exam28.quiz;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반 정원: ");
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 학생 이름: ");
			arr[i] = sc.nextLine();
		}
		
		int magicNumber = (int) (Math.random() * arr.length);
		
		int cnt = 5;
		while(true) {
			System.out.println(cnt--);
			Thread.sleep(1000);
			if (cnt == 0) break;
		}
		
		System.out.println("커피를 쏠 학생: " + arr[magicNumber]);
		
		sc.close();
	}
	
}
