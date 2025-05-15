package pkg_homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 스쿼트\r\n"
				+ "2. 데드리프트\r\n"
				+ "3. 벤치 프레스\r\n"
				+ "4. 풀업\r\n"
				+ "5. 종료\n");
		int code = sc.nextInt();
		
		if (code <= 0) System.out.println("양수만 입력해주세요.");
		else if (code > 5) System.out.println("목록에 있는 숫자만 입력해주세요.");
		else if (code == 1) System.out.println("스쿼트 운동 시간입니다.");
		else if (code == 2) System.out.println("데드리프트 운동 시간입니다.");
		else if (code == 3) System.out.println("벤치 운동 시간입니다.");
		else if (code == 4) System.out.println("풀업 운동 시간입니다.");
		else if (code == 5) System.out.println("오늘도 수고하셨습니다.");
		
		sc.close();

	}
}
