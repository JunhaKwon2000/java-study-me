package sec03.exam02.quiz;

public class Computer {
	
	String model;

	// 디폴트
	public Computer() {
		System.out.println("객체생성완료(모델: " + model + ")");
	}
	
	// 커스텀
	public Computer(String model) {
		this.model = model;
		System.out.println("객체생성완료(모델: " + model + ")");
	}
	
	
	// 클래스 내부의 필드는 그냥 쓰면 됨!(sysout 에 있는 model 처럼)
	
}
