package sec02.exam04.quiz;

public class Calculator {
	
	// method
	// 계산기는 굳이 객체를 만들 필요가 없으니 static 을 쓰는 것이 더 좋은 방법!
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int multiple(int a, int b) {
		return a * b;
	}
	
	public static int divide(int a, int b) {
		return a / b;
	}

}
