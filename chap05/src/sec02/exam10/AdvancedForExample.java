package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for (int score : scores) sum += score;
		
		System.out.println("점수 총합 = " + sum);

		double avg = sum / (double)scores.length;
		System.out.println("평균 = " + avg);
		
		// 정리
		// 기본 for 문 보다 코드가 간결하여 자주 쓰임
		// 만약 배열의 index 가 필요할 경우 기본 for 문 사용
	}

}
