package sec03.exam02;
import java.util.Scanner;

public class CastingExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int intValue = 44032;
		// int intValue = 65636;
		char charValue = (char)intValue; // casting 안해주면 에러
		System.out.println(charValue);
		
		long longValue = 2147483647000L;
		intValue = (int)longValue; // casting 안해주면 에러, 캐스팅 시 원본 long 타입 변수를 4byte로 나눠서 마지막 4byte만 넣음
		System.out.println(intValue); // 값의 손실 발생
		
		double doubleValue = 3.141592; 
		intValue = (int)doubleValue; // casting 안해주면 에러, 정수 부분만 가져옴
		System.out.println(intValue);
		
		
		// Quiz = long 타입을 입력받아 변수 number 에 저장 후 number 변수의 값을 integer 형으로 변환한 결과를 출력하시오.
		System.out.println("이 밑으로는 퀴즈");
		long number = sc.nextLong();
		int intNumber = (int)number;
		System.out.println("long 값: " + number);
		System.out.println("int 값: " + intNumber);
		
		sc.close();
	}

}
