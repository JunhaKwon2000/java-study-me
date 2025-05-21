package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		
		// Calculator cal = new Calculator();
		// double res = 10 * 10 * cal.pi; // static 멤버는 static way 로 접근해주세요(메모리 낭비됨)
		// System.out.println(res);
		
		int a = 10;
		int b = 20;
		
		// static way - access by class name
		System.out.println(a * a * Calculator.pi);
		System.out.println(Calculator.add(a, b));
		System.out.println(Calculator.subtract(a, b));
	}
	
}
