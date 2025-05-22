package sec02.exam04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 매개변수의 타입은 슈퍼 클래스이지만 실제 객체는 서브 클래스들이기 때문에 서브 클래스들의 메소드가 실행됨
		d.drive(bus); // 자동 타입 변환
		d.drive(taxi); // 자동 타입 변환
		
		
	}

}
