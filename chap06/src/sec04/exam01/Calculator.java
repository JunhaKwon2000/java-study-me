package sec04.exam01;

public class Calculator {
	
	public void powerOn() {
		System.out.println("계산기 전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("계산기 전원을 끕니다.");
	}

	public int plus(int a, int b) {
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double divide(int a, int b) {
		return a / (double)b;
	}
	
	
}
