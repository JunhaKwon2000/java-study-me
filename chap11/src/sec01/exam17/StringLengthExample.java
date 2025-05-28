package sec01.exam17;

public class StringLengthExample {

	public static void main(String[] args) {
		
		String ssn = "7306241230123";
		int length = ssn.length();
		
		if (length == 13) System.out.println("유효한 주민번호");
		else System.out.println("이상한 주민번호");
	}
	
}
