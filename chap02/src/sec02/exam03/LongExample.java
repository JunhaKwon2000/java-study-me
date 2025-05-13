package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		
		long var1 = 10; // 8byte
		long var2 = 20L; // L - 명시적으로 long 타입임을 표현(문제 없음)
		
		// java compiler 는 정수 literal 을 integer 타입으로 간주, integer 의 범위를 넘어갈 때는 컴파일 에러(L 을 붙이면 해결)
		long var3 = 20000000000L; // L - 명시적으로 long 타입임을 표현(integer 을 넘어가는 수)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}
