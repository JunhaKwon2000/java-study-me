package sec02.exam08;

public class BooleanExample {

	public static void main(String[] args) {
		
		// boolean(1Byte) - true / false 를 나타냄
		// 제어문(조건문, 반복문)에서 실행 흐름을 변경할 때 주로 사용
		
		boolean stop = false;
		
		if (stop) {
			System.out.println("중지합니다.");
		}
		else {
			System.out.println("시작합니다.");
		}
		
		
		double v = 3.141592;
		System.out.println(Math.round(v * 1000) / 1000.0);
	}

}
