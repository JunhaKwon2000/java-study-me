package sec02.exam01;

public class ArrayCreateByValueExample {
	
	public static void main(String[] args) {
		
		// 값 목록을 이용해서 배열 생성
	
		// 1. 배열 변수 선언과 동시에 값 대입
		int[] arr1 = {83, 90, 87};
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("score[" + i + "]: " + arr1[i]);
		}
		
		// 반복문을 이용한 합계 구하기
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		
		System.out.println("점수의 합계: " + sum);
		System.out.println("평균: " + Math.round((sum / 3.0) * 100.0) / 100.0);
		
		System.out.println();
		
		String[] array = {"사과", "바나나", "오렌지", "포도", "딸기"};
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]: " + array[i]);
		}
		
		
		// 2. 
//		int[] arr2;
//		arr2 = new int[] {10, 20, 30, 40, 50};
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println("score[" + i + "]: " + arr2[i]);
//		}
//		
	}
}
