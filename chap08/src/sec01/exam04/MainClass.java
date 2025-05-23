package sec01.exam04;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 인터페이스는 객체의 사용 방법을 기술한 타입 => 객체 생성 불가능, 대신 인터페이스 타입에다 구현된 객체를 담을 수 있음
		RemoteControl tv = new Television();
		RemoteControl ad = new Audio();
		
		RemoteControl[] controls = new RemoteControl[2];
		
		controls[0] = tv;
		controls[1] = ad;
		
		for (RemoteControl control : controls) {
			control.turnOn();
			control.setVolume(7);
			control.turnOff();
			System.out.println();
		}
		
		System.out.println();
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		// 메서드 호출 코드는 똑같은데 어떤 구현 객체가 대입되었냐에 따라 실행 결과는 달라짐 => 다형성
		
	}
	
}
