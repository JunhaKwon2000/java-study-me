package sec01.exam18;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		
		System.out.println(oldStr); // replace 를 호출해도 원본은 변경 X (애초에 String 은 불변 객체임)
		System.out.println(newStr); // 새로운 객체 생성
		
	}
	
}
