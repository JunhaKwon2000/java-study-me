package sec01.exam06;

public class MainClass {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("구글", "안드로이드");
		
		
		// 오버라이드 전: sec01.exam06.SmartPhone@54bedef2
		// 오버라이드 후: 구글의 스마트폰이며 운영처재는 안드로이드를 사용하고 있습니다.
		// 오버라이드(딸깍) 후: SmartPhone [company=구글, os=안드로이드]
		System.out.println(sp.toString());
		
	}
	
}
