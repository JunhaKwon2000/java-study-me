package sec03.exam01;

// 실체 클래스
public class SmartPhone extends Phone {

	// constructor
	public SmartPhone(String owner) {
		super(owner);
	}	
	
	// method
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
