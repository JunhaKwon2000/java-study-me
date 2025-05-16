package sec02.exam07;

public class WhilePrint1To100Example {
	
	public static void main(String[] args) {
		
		// 1부터 100까지 합
		int cnt = 1;
		int sum = 0;
		while (cnt <= 100) {
			sum += cnt;
			cnt++;
		}
		
		System.out.println(sum);
		
		// 참고: 무한 루프
		
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");
			if (true) flag = false;
		}
		// 실제 사용 예: 특정 조건을 만족하면 멈추도록
		
		int i = 1;
		int doSum = 0;
		
		do { // 처음 한번은 무조건 실행
			doSum += i;
			i++;
		} while (i <= 100);
		System.out.println(doSum);
		
	}
}
