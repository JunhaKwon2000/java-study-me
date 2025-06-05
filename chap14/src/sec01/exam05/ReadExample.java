package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		
		// 길이가 100인 byte 타입의 빈 배열 생성
		byte[] buffer = new byte[100];
		
		try(InputStream is = new FileInputStream("C:/Windows/Temp/test1.db")) {
			while(true) {
				// 입력 스트림으로부터 배열의 길이만큼 읽어옴
				int readByteNum = is.read(buffer); // 읽어올 데이터가 배열의 길이보다 적으면 읽을 수 있는 만큼만 읽음
				if (readByteNum == -1) break;
				for (int i = 0; i < readByteNum; i++) System.out.println(buffer[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		// 많은 양의 바이트를 읽을 때는 read(byte[] b) 를 사용 권장
		// 만약 입력 스트림으로부터 100개의 바이트가 들어온다면 read() 는 100번을 반복해서 읽어야 하지만
		// read(byte[] b) 는 한번 읽을 때 배열 길이만큼 읽기 때문에 횟수가 줄어듦
	}
	
}
