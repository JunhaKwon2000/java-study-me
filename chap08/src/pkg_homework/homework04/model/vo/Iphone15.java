package pkg_homework.homework04.model.vo;

public class Iphone15 extends SmartPhone {
	
	// constructor 
	public Iphone15() {}
	
	// method
	@Override
	public void makeCall() {
		System.out.println("아이폰15는 애플에서 만들어 졌다.");
	}
	
	@Override
	public void takeCall() {
		System.out.println("수신 버튼을 누름");
	}
	
	@Override
	public void touch() {
		System.out.println("정전식");
	}
	
	@Override
	public void charge() {
		System.out.println("고속 충전");
	}

	@Override
	public void picture() {
		System.out.println("1200, 1600만 화소 트리플 카메라");
	}

	@Override
	public void printMaker() {
		System.out.println("갤럭시S24는 삼성에서 만들어 졌다.");
	}

}
