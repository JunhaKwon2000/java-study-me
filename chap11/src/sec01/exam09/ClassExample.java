package sec01.exam09;

public class ClassExample {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		// Class 객체
		// 자바에서 해당 클래스의 메타데이터(클래스가 가지고 있는 정보)를 표현하는 객체
		// JVM 내에서 한 클래스당 하나의 Class 객체만 존재
		
		// Car 클래스의 Class 객체 얻기
		// 방법1
		// Class clazz1 = Car.class;
		Class<?> clazz1 = Car.class;
		
		// 방법2: forName 쓰면 일반예외 발생
		Class<?> clazz2 = Class.forName("sec01.exam09.Car");
		
		// 방법3
		Car car = new Car();
		Class<?> clazz3 = car.getClass();
		
		
		// 참고: 방법1, 2, 3 모두 같은 Class 객체를 참조(생각해보면 당연함, 설계도는 하나고 이 설계도의 정보를 읽어오는 거니까)
		
		System.out.println(clazz1.getName()); // 클래스의 전체 이름 리턴
		System.out.println(clazz2.getSimpleName()); // 패키지를 제외한 클래스의 순수 이름 리턴
		System.out.println(clazz3.getPackage().getName()); // 패키지의 이름 리턴
		System.out.println(clazz3.getPackageName()); // 패키지의 이름 리턴(자바 9부터 추가)
		
		
		// 이 외에도 필드,생성자,메서드 정보도 가져올 수 있음 -> 이 정보를 이용하는 것을 자바에서 "리플렉션"이라고 함
		// 리플렉션은 앱개발에서는 거의 안씀
	}

}
