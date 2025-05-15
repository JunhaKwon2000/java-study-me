package sec01.exam07;

public class SwitchCharExample {
	
	public static void main(String[] args) {
		
		char grade = 'B';
		
		// char 타입 변수도 올 수 있다. (대소문자 구분함)
		// 여러 case 를 묶을 수 있다.
		switch (grade) {
			case 'A': case 'a': System.out.println("우수 회원입니다."); break; // 'A' 이거나 'a' 이거나
			case 'B': case 'b': System.out.println("일반 회원입니다."); break; // 'B' 이거나 'b' 이거나
			default: System.out.println("손님입니다.");
		}
		
	}

}
