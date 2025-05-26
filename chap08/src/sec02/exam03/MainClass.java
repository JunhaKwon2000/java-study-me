package sec02.exam03;

public class MainClass {

	public static void main(String[] args) {
		
		Vehicle v = new Bus();
		
		v.run();
		// v.checkFare(); // 컴파일 에러 - 인터페이스에 정의되어있지 않은 메서드
		
		System.out.println();
		
		Bus b = (Bus) v; // 강제 타입 변환
		b.run();
		b.checkFare();
		
	}
	
}
