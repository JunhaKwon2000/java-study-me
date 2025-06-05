package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Stream: 데이터가 흐르는 운하
// Stream 을 통해 파일/네트워크/키보드/메모리 등에서 데이터를 주고받음
// Input Stream: 외부 -> Java 프로그램으로 데이터 읽기
// Output Stream: Java 프로그램 -> 외부로 데이터 쓰기

// Byte 기반 Stream: 1byte
// Byte 기반 Stream 의 입력: InputStream(Super Class)
// Byte 기반 Stream 의 출력: OutputStream(Super Class)

// 문자 기반 Stream: 2byte = char
// 문자 기반 Stream 의 입력: Reader(Super Class)
// 문자 기반 Stream 의 출력: Writer(Super Class)

public class WriteExample {
	
	public static void main(String[] args) throws Exception {
		
		// byte 기반 File Output Stream
		OutputStream os = new FileOutputStream("C:/Windows/Temp/test1.db"); // 도착지: test1.db
		
		// 출력할 byte (0 ~ 255, 범위 이탈 -> overflow/underflow)
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// Output Stream 으로 데이터 보내기 -> write()
		// 1byte 씩 세번 출력
		// write() 를 해도 바로 출력 스트립으로 데이터가 안감
		// 버퍼(임시 저장 공간)에 쌓임
		// 버퍼: 임시 저장소
		// 출력 스트림: 저장소의 데이터를 외부로 보내기
		os.write(a);
		os.write(b);
		os.write(c);
		os.write("\n안녕하세요, 권준하입니다.\n".getBytes());
		for (int i = 65; i <= 90; i++) {
			os.write(i);
		}
		os.write("\n?????????????????????\n".getBytes());
		
		
		// write() -> flush() 필히 수행
		// flush() -> Buffer 비우기(Buffer 에 남아있는 것들 모두 Output Stream 으로 보내기)
		os.flush();
		
		// 참고: 모든 스트림이 다 버퍼를 갖고 있진 않음
		// FileOutputStream 에는 내부 버퍼 존재 X
		// 즉, write() -> 바로 출력
		// flush() 는 필수는 아니지만, 그래도 명시적으로 호출해주세요
		// 내부적으로 버퍼를 사용하는 클래스들은 flush() 필수
		
		// 작업이 끝난 후 Stream 닫기 -> close()
		// Output Stream 이 사용했던 메모리를 풀어줌
		// close() 메서드에는 flush() 가 내장되어 있음
		os.close();
		
		// 참고: 바이너리 파일/데이터?
		// 0 과 1 로 이루어진 데이터
		// 컴퓨터 내부에서 어차피 다 0/1 이긴 하지만 데이터의 종류를 나누자면
		// 1. 텍스트 데이터: 사람이 읽을 수 있는 문자 중심의 데이터, "hello" 같은거
		// 2. 바이너리 데이터: 사람이 읽을 수 없는 0/1 이진 데이터 (이미지, 동영상, 음악, pdf, 실행파일 등 -> 텍스트가 아닌 모든 데이터(메모장으로 열면 싹다 꺠는거))
		
		// 참고: try-with-resources
		// 이거 쓰면 리소스를 자동으로 닫아줌(close() 자동 호출, try - catch 모두 적용)
		// 모든 스트림에 쓸 수 있는건 아니고, AutoCloseable 인터페이스를 구현한 친구들이여야함
		try (OutputStream oss = new FileOutputStream("C:/Windows/Temp/test1.db")) {
			oss.write("Hello World!\n".getBytes());
			oss.write("JAVA\n".getBytes());
			byte[] arr = {65, 66, 67, 68, 69};
			for (byte bb : arr) oss.write(bb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		InputStream is = new FileInputStream("C:/Windows/Temp/test1.db");
		while(true) {
			int read = is.read();
			if (read == -1) break;
			System.out.println(read);
		}
		
		is.close();
		
	}

}
