package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		// 두 객체는 서로 같은 곳을 바라보고 있음
		String strVar1 = "권준하";
		String strVar2 = "권준하";
		
		// 주소값을 비교하기: 동일한 객체인지 비교
		if (strVar1 == strVar2) System.out.println("strVar1 과 strVal2 는 참조가 같음");
		else System.out.println("strVar1 과 strVal2 는 참조가 다름");
		
		if (strVar1.equals(strVar2)) System.out.println("strVar1 과 strVal2 는 문자열이 같음");
		else System.out.println("strVar1 과 strVal2 는 문자열이 다름");
		
		System.out.println();
		
		// 생성자로 생성한 객체는 항상 새로운 객체임
		String strVar3 = new String("권준하");
		String strVar4 = new String("권준하");
		
		if (strVar4 == strVar3) System.out.println("strVar1 과 strVal2 는 참조가 같음");
		else System.out.println("strVar1 과 strVal2 는 참조가 다름");
		
		if (strVar4.equals(strVar3)) System.out.println("strVar1 과 strVal2 는 문자열이 같음");
		else System.out.println("strVar1 과 strVal2 는 문자열이 다름");
		
		
		
	}

}
