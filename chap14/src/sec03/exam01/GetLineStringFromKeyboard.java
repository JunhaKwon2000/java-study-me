package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) {
		
		// InputStream is = System.in; // System 클래스의 정적 필드, 한 바이트씩 읽어옴
		// 먼저 한 단어를 읽어오기 위해 InputStreamReader 연결
		// Reader reader = new InputStreamReader(is);
		// 마지막으로 한 줄을 싹 읽어오기 위해 BufferedREader 연결
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while(true) {
				System.out.print("입력하세요: ");
				String input = br.readLine();
				if (input.equals("q") || input.equals("quit")) break;
				System.out.println("입력된 내용: " + input);
			}
		} catch (Exception e) {}
		
		
		
	}
	
}
