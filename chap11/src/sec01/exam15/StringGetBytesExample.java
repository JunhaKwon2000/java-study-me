package sec01.exam15;

import java.io.UnsupportedEncodingException;

// 문자열을 바이트 배열로 변환
// 쓰는 경우?
// 1. 파일에 문자열을 바이트로 저장할 때
// 2. 네트워크 전송 시 문자열을 바이트로 변환할 때
// 3. 문자열을 암호화/해시 처리할 때
public class StringGetBytesExample {

	public static void main(String[] args) {
		
		String str = "안녕하세요";
		
		
		// 인코딩: 문자열을 바이트 배열로 바꾸는 과정
		// 그냥 getBytes 는 시스템의 기본 문자셋을 사용함
		byte[] bytes1 = str.getBytes();
		System.out.println("encode length: " + bytes1.length);
		// 한글 1자를 UTF-8 로 인코딩하면 3바이트가 되고, EUC-KR 로 인코딩하면 2바이트가 됨
		// 디코딩: 바이트 배열을 문자열로 다시 복원하는 과정
		String str1 = new String(bytes1);
		System.out.println("decode: " + str1);
		
		System.out.println();
		
		// 특정 문자셋으로 인코딩 가능(예외 발생)
		try {
			
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println("encode length(EUC-KR): " + bytes3.length);
			String str3 = new String(bytes3, "EUC-KR"); // decoding 할 때 encoding 할 때 쓴 캐릭터 셋으로 맞춰줘야함
			System.out.println("decode: " + str3);
			
			System.out.println();
			
			// 사실 시스템 기본이 UTF-8 임
			byte[] bytes2 = str.getBytes("UTF-8");
			System.out.println("encode length(UTF-8): " + bytes2.length);
			String str2 = new String(bytes2, "UTF-8"); // UTF-8 안써도 디코드 됨(시스템 기본이라서)
			System.out.println("decode: " + str2);
			
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
