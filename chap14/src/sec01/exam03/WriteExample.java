package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	
	public static void main(String[] args) {
		
		// 출력할 바이트 배열
		byte[] arr = {65, 66, 67, 68, 69};
				
		// 주어진 배열의 off 부터 len 개 까지의 바이트를 출력
		try (OutputStream os = new FileOutputStream("C:/Windows/Temp/test3.db")) {
			os.write(arr, 1, 3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
