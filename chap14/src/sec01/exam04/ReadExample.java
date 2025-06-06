package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		// 데이터 출발지를 test1.db 파일로 하는 바이트 기반 파일 "입력" 스트림을 생성
		
		try (InputStream is = new FileInputStream("C:/Windows/Temp/test1.db")) {
			// 입력 스트림으로부터 1byte 씩 읽어오고
			// 읽은 바이트를 리턴함
			while(true) {
				int data = is.read();
				if (data == -1) break; // 더이상 읽어올 바이트가 없을 때
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
}
