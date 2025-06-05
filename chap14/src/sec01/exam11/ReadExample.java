package sec01.exam11;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		
		// 데이터의 출발지가 test7.txt 인 파일의 문자 기반 파일 입력 스트림을 생성
		// Reader(FileReader) 는 파일로부터 문자 데이터를 읽을 수 있는 기능을 가짐
		try(Reader r = new FileReader("C:/Windows/Temp/test7.txt")) {
			
			while(true) {
				// 입력 스트림으로부터 한 문자(2byte) 씩 읽어오고
				// int(4byte) 타입으로 리턴
				int data = r.read();
				if (data == -1) break;
				// return 한 int 값에 대응되는 문자를 보고 싶으면 char 타입으로 형변환 하면 문자를 볼 수 있음
				System.out.println(data + " "  + (char)data);
			}
			
			
		} catch (Exception e) {}
		
	}
	
}
