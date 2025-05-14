package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 10;
		// byte byteValue3 = byteValue1 + byteValue2; // compile error - integer + integer
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// char 도 마찬가지(연산 시 integer 로 형변환)
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; // compile error - integer + integer
		int intValue2 = charValue1 + charValue2; 
		System.out.println("유니코드: " + intValue2);
		// 문자로 출력하고 싶다면 char 타입으로 강제 형변환
		System.out.println("문자: " + (char)intValue2);

		
		// 정수 나누기 정수 = 정수
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // integer 끼리의 연산의 결과는 항상 integer
		System.out.println(intValue4);
		
		double intValue5 = intValue3 / 4; // integer 결과를 단순히 double 변수에 담은거라 의도한 거랑 다름 
		System.out.println(intValue5);
		
		// 실수 결과를 얻으려면..? 
		double doubleValue1 = intValue3 / (double)4; // 연산의 한쪽이 double 이어야함
		double doubleValue2 = (double)intValue3 / 4; // 연산의 한쪽이 double 이어야함
		double doubleValue3 = (double)intValue3 / (double)4; // 모두 double 이면 당연히 double
		double doubleValue4 = intValue3 / 4.0; // 연산의 한쪽이 double 이어야함
		System.out.println(doubleValue1);
		System.out.println(doubleValue2);
		System.out.println(doubleValue3);
		System.out.println(doubleValue4);
		
		int x = 1;
		int y = 2;
		
		double result = x / y;
		System.out.println(result);		
		double result2 = x / (double)y;
		System.out.println(result2);
	}

}
