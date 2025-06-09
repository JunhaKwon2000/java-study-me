package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.Reader;


public class CharacterConvertStreamExample {
	// 파일로 문자를 저장하고, 저장된 문자를 다시 읽는 예제
	// 사용하는 소스 스트림(기본 스트림)은 바이트 기반 입출력 스트림이지만, 이 스트림들을 직접 사용하는 것이 아닌 Reader 와 Writer 로 변환해서 사용

	public static void main(String[] args) {
		write("문자 변환 스트림을 사용합니다.");
		System.out.println(read());
	}
	
	
	public static void write(String str) {
		try (FileOutputStream fos = new FileOutputStream("C:/Windows/Temp/test1.txt")) {
			// 문자열 바이트 배열로 만든 다음에 출력해도 되지만, 여기서는 편의를 위해 보조 스트림을 연결해서 문자 -> 바이트로 자동 변환
			Writer w = new OutputStreamWriter(fos); // 문자 기반 출력 보조 스트림을 연결
			w.write(str); // String type 바로 넣기 가능(char[] 배열로 변환 없이), 기본으로 UTF-8 인코딩
			w.flush();
		} catch (Exception e) {}
	}
	
	public static String read() {
		// 이점 -> 굳이 파일이 아닌 다른 스트림(이미지 등) 이 들어왔을 때 코드를 안바꿔도 댐(new FileInputStream("C:/Windows/Temp/test1.txt") <- 여기만 바꿔줘)
		
		try (FileInputStream fis = new FileInputStream("C:/Windows/Temp/test1.txt")) {
			// 바이트 기반 -> 문자 기반으로 변경
			Reader r = new InputStreamReader(fis);
			char[] buffer = new char[100];
			int readCharNum = r.read(buffer);
			
			// 디코딩이 되어 문자로 바로 읽을 수 있음
			String str = new String(buffer, 0, readCharNum);
			return str;
		} catch (Exception e) {return null;}
	}
	
}
