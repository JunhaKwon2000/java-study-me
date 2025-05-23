package sec01.exam02;

public interface RemoteControl {

	// field(상수ㅡ public static final 이 자동으로 붙음, 따라서 반드시 초기값을 넣어줘야함) 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// abstract method
	void control();
	
}
