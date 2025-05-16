package sec02.exam07;

import java.util.Scanner;

public class WhilePrint1To100Example {
	
	public static void main(String[] args) {
		
		// 1부터 100까지 합
		int cnt = 1;
		int sum = 0;
		while (cnt <= 100) {
			sum += cnt;
			cnt++;
		}
		
		System.out.println(sum);
		
		// 참고: 무한 루프
		
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");
			if (true) flag = false;
		}
		// 실제 사용 예: 특정 조건을 만족하면 멈추도록
		// 변수를 사용하는 방식과 true 를 사용하는 방식의 차이점을 알고 있기(코드의 실행 로직)
		
		int i = 1;
		int doSum = 0;
		
		do { // 처음 한번은 무조건 실행
			doSum += i;
			i++;
		} while (i <= 100);
		System.out.println(doSum);
		
		System.out.println("=============================");
		// Quiz: 1부터 100까지 홀수의 합
		int oddSum = 0;
		int oddCnt = 1;
		while (oddCnt <= 100) {
			if (oddCnt % 2 != 0) {
				oddSum += oddCnt;				
			}
			oddCnt++;
		}
		System.out.println(oddSum);
		
		// Quiz2
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		int idx = 0;
		int locSum = 0;
		
		while (idx <= (N.length() - 1)) {
			locSum += Integer.parseInt(N.charAt(idx) + "");
			idx++;
		}
		System.out.println(locSum);
		
		sc.close();
		
		
		
	}
}
