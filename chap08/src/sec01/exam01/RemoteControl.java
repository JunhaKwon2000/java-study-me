package sec01.exam01;

// 인터페이스의 구성 멤버 - 상수 + 추상 메서드 (본질) -> 나중에 자바 버전이 올라가면서 디폴트 메서드 + 정적 메서드 등이 추가됨
// 인터페이스는 추상 클래스보다 더욱 더 추상화 된 껍데기(뼈대만 있는 설계 규격)
// 인터페이스는 구현된 것이 전혀 없는 설계 규격이고, 모든 멤버의 접근 제한자가 public 임(안써도)
// 인터페이스를 객체의 사용 설명서라고 부르기도 함(객체의 사용 방법을 정의한 사용 설명서)
// can - be 관계 -> Airplane can be Flyable, Fighter can be Fightable, TV can be RemoteControl, Audio can be RemoteControl
public interface RemoteControl {

	// field(상수ㅡ static final) 
	
	
	// abstract method
	void control();
	
	
}
