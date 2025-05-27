package sec01.exam03;

public class Key {
	
	// field
	public int number;
	
	// constructor
	public Key(int number) {
		this.number = number;
	}
	
	// method
	@Override
	public boolean equals(Object object) {
		System.out.println("equals(Override) 메서드 호출하는지 확인용.");
		if (object instanceof Key compareKey) {
			if (number == compareKey.number) return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode(Override) 메서드 호출하는지 확인용.");
		// number 필드의 값이 같은 객체들은 모두 같은 해시코드가 나올 수 있도록 오버라이드
		return number;
	}

}
