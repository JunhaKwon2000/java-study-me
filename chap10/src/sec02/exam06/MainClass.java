package sec02.exam06;

public class MainClass {

	public static void main(String[] args) {
		
		UserSevice us = new UserSevice();
		
		// 예외를 던졌으므로 호출하는 쪽에서 예외 처리해줘야함
		try {
			us.registerUser(30);			
			us.registerUser(-123);			
		} catch (InvalidAgeException e) { // e: Exception object
			System.out.println(e.getMessage()); // 예외 메시지 출력
		}
		
		
		
	}
	
}
