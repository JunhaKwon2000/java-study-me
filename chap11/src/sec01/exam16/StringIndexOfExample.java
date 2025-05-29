package sec01.exam16;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		// String subject = "C++ 프로그래밍";
		
		int loc = subject.indexOf("프로그래밍"); // 찾은 문자열의 시작 인덱스를 반환
		System.out.println(loc);
		
		if(subject.indexOf("자바") != -1) System.out.println("자바 <- 포함됨");
		else System.out.println("자바 <- 포함안됨");
		
		// 추가 실습: 문자열 포함 여부를 알려주는 메서드(boolean return)
		if(subject.contains("자바")) System.out.println("자바 <- 포함됨");
		else System.out.println("자바 <- 포함안됨");
		
	}
	
}
