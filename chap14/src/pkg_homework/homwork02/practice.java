package pkg_homework.homwork02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class practice {
	
	public static long method1(String dir) {
		long s = System.nanoTime();
		try (FileInputStream fis = new FileInputStream(dir)) {
			while (true) {
				int data = fis.read();
				if (data == -1) break;
			}
		} catch (Exception e) {}
		long e = System.nanoTime();
		return e - s;
	}
	
	public static long method2(String dir) {
		long s = System.nanoTime();
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(dir));) {
			while(true) {
				int data = bis.read();
				if (data == -1) break;
			}
		} catch (Exception e) {}
		long e = System.nanoTime();
		return e - s;
	}

}
