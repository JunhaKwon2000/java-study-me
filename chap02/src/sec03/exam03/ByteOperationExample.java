package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {

		// 기본 전제 - 두 개의 값 중 크기가 큰 타입으로 자동 변환
		
		// 산술 연산에서 integer 타입 이하일 경우에는 integer 로 자동 변환
		byte x = 10;
		byte y = 20;
		// byte res = x + y; // compile error - Type mismatch, integer 이하 타입들은 연산 시 전부 integer 형으로 변환됨
		int res = x + y;
		System.out.println(res);
		
		
	}

}
