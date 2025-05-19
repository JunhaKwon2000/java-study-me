package sec02.exam06;

import java.util.Scanner;

public class ArrayInArrayExample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 2행 3행 2차원 배
		
		int[][] mathScores = new int[2][3];
		
		// mathScores.length = 2
		// mathScores[0].length = 3
		// mathScores[1].length = 3
		// for 문에서는 바깥 for 문의 index 를 넣어주세요 => mathScores[i].length
		
		// 2차원 배열의 모든 요소에 접근하려면 중첩 for 문이 필요
		// 바깥 for 문 => 행을 반복, 안쪽 for 문 => 열을 반복
		
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		
		System.out.println();
//		
//		for (int i = 0; i < mathScores.length; i++) {
//			for (int j = 0; j < mathScores[i].length; j++) {
//				System.out.print((i + 1) + "행 " + (j + 1) + "열의 값을 입력해 주세요 : ");
//				mathScores[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.println();
//		
//		for (int i = 0; i < mathScores.length; i++) {
//			for (int j = 0; j < mathScores[i].length; j++) {
//				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
//			}
//		}
		
		// 2행의 2차원 배열
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]);
			}
		}
		
		System.out.println();
		
		// 값 목록으로 2차원 배열 만들기(줄바꿈 해주세요 가독성을 위해)
		int[][] javaScores = {
				{95, 80}, 
				{92, 96, 80}
				};
		
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j]);
			}
		}
		
		
		sc.close();
		
	}
}
