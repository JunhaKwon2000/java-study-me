package ex;

import java.util.Scanner;

public class RunEx {
	
	public void run(int choice) {
		if (choice == 1) {
			method1();
		}
		else if (choice == 2) {
			method2();
		}
		else if (choice == 3) {
			method3();
		}
		else if (choice == 4) {
			method4();
		}
		else if (choice == 5) {
			method5();
		}
		else if (choice == 6) {
			method6();
		}
		else {
			System.out.println("문제는 1번부터 6번까지");
		}
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if (age < 3 || age > 64) System.out.println("당신의 놀이동산 요금은 무료입니다.");
		else if (age <= 12) System.out.println("당신의 놀이동산 요금은 10000원입니다.");
		else if (age <= 18) System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		else if (age <= 64) System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		if (month == 3 || month == 4 || month == 5) System.out.println("봄");
		else if (month == 6 || month == 7 || month == 8) {
			if (temp >= 33) {
				if (temp >= 35) {
					System.out.println("여름 폭염 경보");
				}
				else {
					System.out.println("여름 폭염 주의보");					
				}
			}
		}
		else if (month == 9 || month == 10 || month == 11) System.out.println("가을");
		else if (month == 12 || month == 1 || month == 2) {
			if (temp <= -12) {
				if (temp <= -15) {
					System.out.println("겨울 한파 경보");
				}
				else {
					System.out.println("겨울 한파 주의보");					
				}
			}
		}
		else System.out.println("해당하는 계절이 없습니다.");
		
		sc.close();
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int c = sc.nextInt();
		
		int min = (a <= b) ? (a <= c ? a : c) : (b <= c ? c : c); 
		System.out.println("세 수 중에서 가장 작은 수는 " + min + "입니다.");
		
		sc.close();
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		
		switch (code) {
			case 400: System.out.println("잘못된 요청입니다."); break;
			case 404: System.out.println("요청하신 서비스를 찾을 수 없습니다."); break;
			case 500: System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다."); break;
			case 503: System.out.println("일시적인 서버 오류가 발생하였습니다."); break;
			default: System.out.println("알 수 없는 오류가 발생하였습니다.");
		}
		
		sc.close();
	}
	
	public void method5() {
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
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하세요.");
		
		System.out.print("소프트웨어설계 점수: ");
		int a = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int b = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int c = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int d = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int e = sc.nextInt();
		
		String[] arrSubjects = {"소프트웨어설계", "소프트웨어개발", "데이터베이스구축", "프로그래밍언어활용", "정보시스템구축관리"};
		int[] arrScore = {a, b, c, d, e};
		
		double avg = (a + b + c + d + e) / 5.0;
		
		if (a >= 40 && b >= 40 && c >= 40 && d >= 40 && e >= 40) {
			if (avg >= 60.0) System.out.println("합격을 축하합니다!");
			else System.out.println("불합격: 평균이 60점보다 낮습니다.");
		}
		else {
			for (int i = 0; i < arrScore.length; i++) {
				if (arrScore[i] < 40) {
					System.out.println("불합격: " + arrSubjects[i] + " 과목의 점수가 " + arrScore[i] + "점으로 40점보다 낮습니다.");
					break;
				}
			}
		}

		sc.close();
	}
	
	
	
}
