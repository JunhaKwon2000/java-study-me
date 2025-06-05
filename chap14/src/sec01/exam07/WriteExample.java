package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	
	public static void main(String[] args) {
		
		// 데이터 도착지를 test7.txt 파일로 하는 문자 기반 파일 출력 스트림을 생성
		// writer/reader 나 input/output stream 모두 유니코드 기반
		char a = 'A';
		char b = 'B';
		char c = '가';
		
		
		// 한 문자(2byte)씩 세 번 출력
		// 인코딩은 기본 인코딩으로(UTF-8)
		try(Writer writer = new FileWriter("C:/Windows/Temp/test7.txt")) {
			writer.write(a);
			writer.write(b);
			writer.write(c);
		} catch (Exception e) {
			
		}
		
	}

}
