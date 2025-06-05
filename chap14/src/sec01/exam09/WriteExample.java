package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		
		char[] arr = {'A', 'B', 'C', 'D', 'E'};
		
		try(Writer writer = new FileWriter("C:/Windows/Temp/test9.txt")) {
			// 주어진 배열의 off 부터 len 개 까지의 문자를 출력
			writer.write(arr, 1, 3);
		} catch (Exception e) {
			
		}
		
	}
	
}
