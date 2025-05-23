package sec01.exam04;

public interface RemoteControl {

	// field(상수ㅡ public static final 이 자동으로 붙음, 따라서 반드시 초기값을 넣어줘야함) 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// abstract method - 실행 블록 없음
	// public abstract 가 자동으로 붙음
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
