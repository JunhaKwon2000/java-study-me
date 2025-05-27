package sec02.exam06;

public class UserSevice {
	
	// method
	public void registerUser(int age) throws InvalidAgeException {
		if (age < 0) {
			// 예외 발생 시키기 = 소갲
			throw new InvalidAgeException("age can't be under 0");
			// 메시지를 통해 어떤 오류인지 명확하게 알 수 있음
		}
		
		System.out.println("Age: " + age);
		System.out.println("User registered.");
	}

}
