package sec01.exam11;

public class ByteToStrinExample {

	public static void main(String[] args) {
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		
		String str1 = new String(bytes); // 각각의 keycode 값을 문자로 바꾸고 문자열로 리턴(배열아님)
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4); // bytes 배열의 인덱스 6번부터 총 4개
		System.out.println(str2);
	}
	
}
