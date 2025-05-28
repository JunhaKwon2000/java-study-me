package sec01.exam22.quiz;

import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[] args) {
		
		// Quiz
//		입력된 문자열 중 숫자들의 합계를 출력하시오.

//		[입력]
//		1) 1,2,3,4,5
//		2) 1-2-3-4-5
//		3) a1b2c3de45

//		[출력]
//		1) 15
//		2) 15
//		3) 15
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int sum = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			// 참고: Character.isDigit(ch) 으로도 가능
			if (c >= '0' && c <= '9') {
				// 참고: Character.getNumbericValue(ch)
				sum += Integer.parseInt(c + "");
			}
		}
		
		System.out.println(sum);
		
		sc.close();
		
		
	}

}
