package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("int value: " + intValue); // byte(1) 를 integer(4) 에 넣을 수 있음 (자동 형변환)
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("int value: " + intValue); // char(2) 를 integer(4) 에 넣을 수 있음 (자동 형변환)
		
		intValue = 30;
		long longValue = intValue;
		System.out.println("long value: " + longValue); // integer(4) 를 long(8) 에 넣을 수 있음 (자동 형변환)
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("float value: " + floatValue); // long(8) 를 float(4) 에 넣을 수 있음 (float 의 실제 저장가능한 값의 범위가 더 큼, 자동 형변환)
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("double value: " + doubleValue); // float(4) 를 double(8) 에 넣을 수 있음 (자동 형변환)
		
		// 주의사항 - byte 를 char 에 넣을 때 - char 는 음수를 포함하지 않는데 byte 타입은 음수를 포함하기 때문에 범위가 포함이 안됨
		// byte bbb = 20;
		// char ccc = bbb; // compile error - type mismatch(cannot convert from byte to char)
		

	}

}
