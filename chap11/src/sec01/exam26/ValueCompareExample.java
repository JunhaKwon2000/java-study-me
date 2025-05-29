package sec01.exam26;

public class ValueCompareExample {

	public static void main(String[] args) {
		
		// Wrapper 객체 내부의 값을 비교할 때 == 비교가 아닌 equals() 메서드 또는 UnBoxing 한 값으로 비교
		
		// Integer: -128 ~ 127 볌위일 경우
		Integer obj1 = 100; // 하나의 객체를 공유중
		Integer obj2 = 100; // 하나의 객체를 공유중
		System.out.println(obj1 == obj2); // 범위 안의 값일 경우 == 사용 가능(권장 x)
		System.out.println(obj1.equals(obj2)); // equals() 메서드(오버라이드)
		System.out.println(obj1.intValue() == obj2.intValue()); // UnBoxing
		
		System.out.println();
		
		// Integer: -128 ~ 127 초과값일 경우
		Integer obj3 = 200;
		Integer obj4 = 200;
		System.out.println(obj3 == obj4); // 범위 밖의 값일 경우 == 사용 불가
		System.out.println(obj3.equals(obj4)); // equals() 메서드(오버라이드)
		System.out.println(obj3.intValue() == obj4.intValue()); // UnBoxing
	}
	
}
