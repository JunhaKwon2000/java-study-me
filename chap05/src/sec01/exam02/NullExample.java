package sec01.exam02;

public class NullExample {

	public static void main(String[] args) {
		
		// String hobby = null;
		// System.out.println(hobby.length()); // NullPointerException(객체가 없으니 메소드 이용 불가)

		String hobby = "배드민턴";
		System.out.println(hobby.length());
		
		String name = "권준하";
		name = null; // 참조를 끊기
		
		// 이 때 "권준하" 러눈 객체는 쓰레기 객체가 됨
		// Garbage Collector 가 CPU 가 한가할 때나 메모리가 부족할 때 메모리에서 자동으로 제거해줌!
		
		System.out.println(name); // GC 가 쓰레기 객체를 수거해감(그 어떠한 변수도 해당 객체를 참조하고 있지 않을 때)
	}

}
