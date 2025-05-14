package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("Result1 = " + result1);
		System.out.println("Result2 = " + result2);

		byte b = 100;
		// byte result3 = -b; // compile error - int 를 byte 로 바꿀 수 없음
		int result3 = -b;
		System.out.println("Resul3 = " + result3);
		
	}

}
