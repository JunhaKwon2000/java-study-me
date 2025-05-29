package sec01.exam23;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// Wrapper 객체: 기본 타입 값을 갖는 객체
		// Boxing: 기본 타입의 값 -> 객체
		
		// Boxing: 1. 생성자 이용(deprecated)
		// Integer obj1 = new Integer(100); // int 타입의 값 100을 포장하는 객체
		// Integer obj2 = new Integer("100"); // 생성자 오버로드	
		
		// Boxing: 2. valueOf() 메서드 이용
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("100"); // 메서드 오버로드
		System.out.println(obj1 + " " + obj2); 
		
		// UnBoxing: 객체 -> 기본 타입의 값
		int val1 = obj1.intValue(); // obj1 객체 안에 있는 기본 타입의 값을 꺼내 int 형 변수 val1 에 할당
		int val2 = obj2.intValue();
		System.out.println(val1 + " " + val2);
		
	}
	
}
