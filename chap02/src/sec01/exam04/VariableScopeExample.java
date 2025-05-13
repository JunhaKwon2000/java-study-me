package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
	
		int v1 = 15; // main method 안에서 선언
		
		if (v1 > 10) {
			int v2 = v1 - 10; // if 블록 안에서 선언(지역 변수)
			System.out.println(v2); // 실행 가능
		}
		
		// int v3 = v2 + 10; // 컴파일 에러
		// System.out.println(v2); // 컴파일 에러

	}

}