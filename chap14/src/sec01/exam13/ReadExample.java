package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		
		// 길이가 100인 char 타입의 빈 배열 생성
		char[] buffer = new char[5];
		
		try(Reader r = new FileReader("C:/Windows/Temp/test9.txt")) {
			while(true) {
				// 입력 스트림으로부터 3개의 문자를 읽고 인덱스 2부터 순차적으로 저장
				int readCharNum = r.read(buffer, 2, 3);
				if (readCharNum == -1) break;
				
				// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
				for (int i = 0; i < buffer.length; i++) {
					System.out.print(buffer[i]);
				}
			}
		} catch (Exception e) {}
		
	}
	
}
