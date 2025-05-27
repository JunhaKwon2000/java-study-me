package sec01.exam04;

public class Member {
	
	// class 만들 때 아무것도 상속을 받지 않으면 자동으로 Object 클래스를 상속받음(extends Object), 그래서 Object 클래스 안에 있는 메서드들을 사용할 수 있는거임
	
	// field
	public String id;
	
	
	// constructor
	public Member(String id) {
		this.id = id;
	}

	
	// method
	@Override
	public boolean equals(Object object) {
		if (object instanceof Member m) { 
			if (id.equals(m.id)) return true; 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
		// id 는 String 이니까 String 클래스에서 오버라이드된 hashCode 메서드를 가져오면 id 의 값이 같으면 해시코드도 같겠다!!!
	}
}
