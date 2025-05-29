package sec01.exam24;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// Auto Boxing: Wrapper 객체가 생성되고 객체의 주소가 참조 변수에 대입됨
		Integer obj = 100;
		System.out.println(obj);
		
		// Auto UnBoxing: 객체 안에 있는 기본 타입 값을 꺼내 대입
		int val1 = obj; // 대입할 때 발생
		int val2 = obj + 100; // 연산할 때 발생
		System.out.println(val1 + " " + val2);
		
	}
	
}
