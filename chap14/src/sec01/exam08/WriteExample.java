package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	
	public static void main(String[] args) {
		
		char[] arr = {'A', 'B', 'C'};
		
		try(Writer writer = new FileWriter("C:/Windows/Temp/test8.txt")) {
			writer.write(arr);
		} catch (Exception e) {
			
		}
		
	}

}
