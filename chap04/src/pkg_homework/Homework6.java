package pkg_homework;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
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
