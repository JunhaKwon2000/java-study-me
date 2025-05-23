package sec03.exam01;

public class MainClass {
	
	public static void main(String[] args) {
		
		// Phone phone = new Phone("Junha"); // compile error - 추상 클래스를 new 로 인스턴스화 불가능
		
		Phone p = new SmartPhone("Junha");
		
		p.turnOn();
		p.turnOff();
		
		
		SmartPhone p2 = new SmartPhone("Junha");
		
		p2.turnOn();
		p2.internetSearch();
		p2.turnOff();
		
		// 추상 클래스는 객체 생성을 하지 못하는게 아니라 직접(단독) 객체를 생성 못할 뿐
		// 어차피 상속받은 놈이 생성되면 슈퍼 추상 클래스의 객체도 생성됨
		
		
	}

}
