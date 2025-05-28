package sec01.exam22;

public class StringValueOfExample {

	public static void main(String[] args) {
		
		// 기본 타입 값을 문자열로 변환
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println();
		
		System.out.println(str1 instanceof String);
		System.out.println(str2 instanceof String);
		System.out.println(str3 instanceof String);
		
		System.out.println();
		
		// 문자열로 변환하는 간단한 방법: + ""
		String str4 = 10 + "";
		String str5 = 10.5 + "";
		String str6 = true + "";
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		System.out.println();
		
		System.out.println(str4 instanceof String);
		System.out.println(str5 instanceof String);
		System.out.println(str6 instanceof String);
	}
	
}
