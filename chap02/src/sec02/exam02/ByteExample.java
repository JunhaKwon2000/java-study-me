package sec02.exam02;

public class ByteExample {

	public static void main(String[] args) {
		
		byte var1 = 127; // 1btye (-128 ~ 127)
		byte var2 = 0; // 1btye (-128 ~ 127)
		byte var3 = -128; // 1btye (-128 ~ 127)
		// byte var4 = 128; // 컴파일 에러 - 범위를 벗어난 값
		System.out.println(var1 + " " + var2 + " " + var3);
		
		System.out.println();
		
		// 실행 중 값의 범위를 벗어난 경우 - 순환 발생
		byte var5 = 126;
		for (int i = 0; i < 5; i++) {
			System.out.println(var5);
			var5++;
			// overflow 발생(127 -> -128)
		}
		
		System.out.println();
		byte var6 = -127;
		for (int i = 0; i < 5; i++) {
			System.out.println(var6);
			var6--;
			// underflow 발생(-128 -> 127)
		}
		
	}

}
