package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		// cal.plus(5, 6); // 문제 없음(리턴값이 있는데 필요없으면 받지 않아도 됨)
		
		int sum = cal.plus(5, 6);
		int sub = cal.minus(5, 6);
		int mul = cal.multiply(5, 6);
		
		byte x = 10;
		byte y = 4;
		double div = cal.divide(x, y); // byte -> integer 타입으로 자동 타입 변환(매개변수가 integer)
		
		System.out.println("(+)" + sum + " " + "(-)" + sub + " " + "(*)" +  mul + " " + "(/)" + div);
		
		// double result = cal.divide(10.5, 20.0); // compile error -> double 을 integer 로 변환 불가능
		
		cal.powerOff();
		
	}
	
}
