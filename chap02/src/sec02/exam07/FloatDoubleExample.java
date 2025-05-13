package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// float - 4Byte, double - 8Btye
		// 부동소수점 - 가수 * 10의 지수 제곱으로 표현, 해당 방식으로 메모리에 저장하면 같은 크기를 갖는 int, long 보다 더 큰 수를 저장 가능함
		
		float f1 = 3.14f; // 실수는 compiler 가 double 로 해석, float 로 저장하려면 f/F 를 붙어주세요
		// double 타입을 float 타입에 바로 넣을 수 없음(double 이 크기가 더 큼)
		// float f2 = (double)2.89298132; // compile error
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		System.out.println();
		
		// 정밀도 테스트
		float f3 = 0.1234567890123456789f;
		double d2 = 0.1234567890123456789;
		
		System.out.println(f3);
		System.out.println(d2);

		System.out.println();
		
		// e
		double d3 = 103e3; // 103.0 * 10^6
		double d4 = 103e-5; // 103.0 * 10^-5
		// int v1 = 3e6; // compile error (double 이 int 보다 더 큰 타입, e/E 는 실수 literals)
		float f4 = 3e3f;
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(f4);
	}

}