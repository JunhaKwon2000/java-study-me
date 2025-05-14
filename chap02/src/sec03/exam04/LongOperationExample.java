package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		
		// 정수 타입의 산술 연산에서 하나라도 long 타입이면 long 으로 자동 변환
		
		byte x = 20;
		long y = 40;
		
		// int res = x + y; // compile error - Type mismatch, byte 가 long 으로 바뀌면서 연산 결과도 long 이 됨
		long res = x + y;
		System.out.println(res);
		
		
		byte v1 = 10;
		int v2 = 100;
		long v3 = 1000L;
		
		// int res2 = v1 + v2 + v3; // compile error - Type mismatch
		long res2 = v1 + v2 + v3; // int + int + long -> long + long
		System.out.println(res2);

	}

}
