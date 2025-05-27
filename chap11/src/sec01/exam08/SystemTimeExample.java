package sec01.exam08;

public class SystemTimeExample {

	
	public static void main(String[] args) {
		
		// 1부터 100만까지 합을 구하는데 걸리는 시간 측정
		
		int sum = 0;
		
		long start = System.nanoTime();
		
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();
		
		System.out.println(sum);
		System.out.println(end - start + "ns 걸림");
		
		// 주로 실행 시간, 성능 테스트 등에 쓰임
	}
}
