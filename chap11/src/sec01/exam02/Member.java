package sec01.exam02;

public class Member {
	
	// class 만들 때 아무것도 상속을 받지 않으면 자동으로 Object 클래스를 상속받음(extends Object), 그래서 Object 클래스 안에 있는 메서드들을 사용할 수 있는거임
	
	// field
	public String id;
	
	
	// constructor
	public Member(String id) {
		this.id = id;
	}
	
	// method
	// Object 클래스 안에 있는 equals 메서드 오버라이드(원본은 주소값 비교(같은 객체를 참조하는지, 물리적으로 같음) -> 오버라이드는 id 값을 비교(논리적으로 같음))
	
	@Override
	public boolean equals(Object object) {
		// 매개변수의 타입이 Object 타입으로 모든 객체가 대입 가능, 그래서 먼저 들어온 객체가 Member 타입인지 체크를 해줘야함
		if (object instanceof Member m) { // Object 타입에 id 라는 필드가 없으니까 이걸 Member 타입으로 강제 타입 변환(캐스팅) 해줘야함!
			if (id.equals(m.id)) return true; // 여기서 쓴 equals 는 String 클래스에 있는 오버라이드된 equals
		}
		return false; // 다른 타입의 객체가 들어오면 보나마나 false, 그리고 id 값이 달라도 false
	}
}
