package sec02.exam04;

public class ArrayLengthExample {
	
	public static void main(String[] args) {
		
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) { // 하드 코딩, 배열의 길이가 바뀌면 전부 수정해줘야함 -> length
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		System.out.println("평균: " + Math.round((sum / (double)scores.length) * 100.0) / 100.0);
		
		// Quiz
//		총 10명의 학생들의 출석 여부를 표현한 배열 attendance가 있습니다. 
//		학생이 출석한 경우 1, 결석한 경우 0으로 표시되어 있습니다. 
//		출석한 학생의 수를 계산하여 출력해주세요.
		
		int[] attendance = {1, 1, 1, 1, 1, 0, 1, 0, 0, 1};
		int cnt = 0;
		for (int i = 0; i < attendance.length; i++) {
			if (attendance[i] == 1) cnt++;
		}
		System.out.println("출석한 학생의 수: " + cnt);

		
	}
}
