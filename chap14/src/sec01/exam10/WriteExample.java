package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		
		// Writer 는 문자열을 좀 더 쉽게 보내기 위해서 write(String str) 메서드를 제공
		String str = "ABC";
		String test = "자바 프로그래밍";
		try(Writer writer = new FileWriter("C:/Windows/Temp/test10.txt")) {
			writer.write(str);
			writer.write(str, 1, 2);
			for (int i = test.length() - 1; i >= 0; i--) writer.write(test.charAt(i) + "");
		} catch (Exception e) {
			
		}
		
	}
	
}
