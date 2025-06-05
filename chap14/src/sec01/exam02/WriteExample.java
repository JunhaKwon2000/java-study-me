package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	
	public static void main(String[] args) {
		
		// 출력할 바이트 배열
		byte[] arr = {65, 66, 67, 68, 69};
				
		// Quiz: 데이터 도착지를 test2.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		try (OutputStream os = new FileOutputStream("C:/Windows/Temp/test2.db")) {
			os.write("Hello World!\n".getBytes());
			os.write("JAVA\n".getBytes());
			for (byte b : arr) os.write(b);
			os.write("\n".getBytes());
			os.write(arr, 1, 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
