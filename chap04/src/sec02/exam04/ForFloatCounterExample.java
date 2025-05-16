package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		// 잘못된 예!
		for (float i = 0.1f; i <= 1.0f; i += 0.1f) {
			System.out.println(i); // 9 iterations, not 10
			// i 에 1.0씩 더할 때 정확하게 0.1이 더해지는 것이 아님!
		}
	}
	// 초기화식에 사용되는 변수는 정수 타입을 쓰는 게 좋음

}
