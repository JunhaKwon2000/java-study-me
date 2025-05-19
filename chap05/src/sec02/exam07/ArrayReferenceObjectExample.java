package sec02.exam07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		
		System.out.println(strArray[0] == strArray[1]); // String 객체는 값이 동일하면 주소가 동일함(같은 객체를 바라보고 있음)
		System.out.println(strArray[0] == strArray[2]); // 생성자로 생성한 String 이라 값이 같더라도 주소가 다름
		System.out.println(strArray[0].equals(strArray[2])); // equals 메소드는 값을 비교하므로 true!
	}
}
