package sec01.exam20;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		String origin = "Java Programming";
		String origin2 = "JAVA Programming";
		
		System.out.println(origin.equals(origin2)); // 대소문자 구분함 -> false
		
		System.out.println();
		
		// 대소문자 상관없이 비교하고 싶을 때
		String upper = origin.toUpperCase();
		String upper2 = origin2.toUpperCase();
		System.out.println(upper);
		System.out.println(upper.equals(upper2));
		
		System.out.println();
		
		String lower = origin.toLowerCase();
		String lower2 = origin2.toLowerCase();
		System.out.println(lower);
		System.out.println(lower.equals(lower2));
		
		System.out.println();
		
		// String 에서 제공하는 equalsIgnoreCase 메서드를 통해 이런 작업 없이 대소문자 상관없이 비교 가능
		System.out.println(origin.equalsIgnoreCase(origin2));
		
	}
	
}
