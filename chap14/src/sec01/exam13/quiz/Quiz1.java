package sec01.exam13.quiz;

import java.io.FileReader;
import java.io.Reader;

public class Quiz1 {
// 		Quiz
//		FileReader를 사용하여 
//		"C:/Temp/output.txt" 파일을 읽어와서 콘솔에 표준 출력하세요.
//  	힌트: 읽은 char 배열을 문자열로 변환 후 출력 또는 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 하나씩 출력
	
	public static void main(String[] args) {
		
		char[] buffer = new char[100];
		String result = "";
		
		try(Reader r = new FileReader("C:/Windows/Temp/output.txt")) {
//			한 문자씩 읽어오기(문자 하나씩 직접 처리해야하는 경우)
//			while(true) {
//				int readCharNum = r.read(buffer);
//				if (readCharNum == -1) break;
//				
//				for (int i = 0; i < readCharNum; i++) {
//					System.out.print(buffer[i]);
//				}
//			}
			
			
			// char[] -> String 으로(생성자 오버로드)
			int readCharNum = r.read(buffer);
			result = new String(buffer, 0, readCharNum);
			
		} catch (Exception e) {}
		
		System.out.println(result);
		
	}
	
}
