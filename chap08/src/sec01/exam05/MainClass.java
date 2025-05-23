package sec01.exam05;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		SmartTelevision tv = new SmartTelevision();
		
		// 하나의 객체를 가지고 두 인터페이스로 사용하는 예제
		
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		// rc.search("www.naver.com"); // 이건 Searchable 인터페이스꺼라 안됨
		
		Searchable sc = tv;
		
		sc.search("www.naver.com");
		
		// 객체를 어떤 인터페이스 타입에 저장할지 결정하는 기준은 "어떤 기능만 사용할 것인가"를 기준으로 하면 된다!!
		// 사용하고자 하는 기능(메서드)의 범위에 따라 선택하면 됨
		// 모든 기능 사용하기 -> SmartTelevision 타입에 담으면 됨
	}

}
