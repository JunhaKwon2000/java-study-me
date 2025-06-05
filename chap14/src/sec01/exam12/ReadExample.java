package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	
	public static void main(String[] args) {
		
		// 길이가 100인 char 타입의 빈 배열 생성
		char[] buffer = new char[100];
		
		try(Reader r = new FileReader("C:/Windows/Temp/test8.txt")) {
			while(true) {
				// 입력 스트림으로부터 배열의 길이만큼 읽어옴
				int readCharNum = r.read(buffer);
				if (readCharNum == -1) break;
				
				// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
				for (int i = 0; i < readCharNum; i++) {
					System.out.print(buffer[i]);
				}
			}
		} catch (Exception e) {}
		
		// 많은 양의 문자를 읽을 때는 read(char[] cbuf) 를 사용 권장
		// 만약 입력 스트림으로부터 100개의 문자가 들어온다면 read() 는 100번을 반복해서 읽어야 하지만
		// read(char[] cbuf) 는 한번 읽을 때 배열 길이만큼 읽기 때문에 횟수가 줄어듦
		
	}

}
