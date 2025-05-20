package sec04.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		
		// 외부에서 호출 시 우선 객체부터 생성
		Calculator cal = new Calculator();
		
		// 참조 변수와 객체 접근 연산자(.)를 사용하여 메소드 호출
		cal.execute();
	}
	
}
