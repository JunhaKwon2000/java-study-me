package sec01.exam19;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		String ssn = "001020-3XXXXXX";
		
		String firstNum = ssn.substring(0, 6); // 인덱스 0 부터 6까지(6은 포함 X, 사실상 0 이상 5이하 인 친구들)
		
		String lastNum = ssn.substring(7); // 인덱스 7 이상인 친구들
		
		System.out.println(firstNum);
		System.out.println(lastNum);
		
	}
	
}
