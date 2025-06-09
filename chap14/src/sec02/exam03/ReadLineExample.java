package sec02.exam03;

import java.io.*;
public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		
//		String test = "C 언어\nJava 언어\nPython 언어";
//		try(Writer writer = new FileWriter("C:/Windows/Temp/test20.txt")) {
//			writer.write(test);
//		} catch (Exception e) {}
		
		Reader reader = new FileReader(ReadLineExample.class.getResource("test20.txt").getPath());
		BufferedReader br = new BufferedReader(reader);
		
		// 한 문자씩 읽는 것보다 한 줄을 읽는 것이 더 좋은 성능
		// readLine() -> enter 전까지 읽음(한 줄), 더이상 읽을 것이 없다면 null 반환
		while(true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(str);
		}
		
		br.close();
		
	}
	
}
