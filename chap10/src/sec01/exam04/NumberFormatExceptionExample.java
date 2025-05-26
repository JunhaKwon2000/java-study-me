package sec01.exam04;

public class NumberFormatExceptionExample {
	
	public static void main(String[] args) {
		
		String d1 = "100";
		String d2 = "a1000";
		
		Integer.parseInt(d1);
		Integer.parseInt(d2); // 예외
		
		// at~ 이후는 호출 스택(First in Last out)
		
		
	}

}
