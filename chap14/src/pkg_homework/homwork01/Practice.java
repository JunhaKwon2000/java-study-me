package pkg_homework.homwork01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Practice {
	
	public static long method1(String song) {
		long s = System.nanoTime();
		try (FileOutputStream fos = new FileOutputStream("C:/test/sub/나비야1.dat")) {
			fos.write(song.getBytes());
		} catch (Exception e) {}
		long e = System.nanoTime();
		return e - s;
	}
	
	public static long method2(String song) {
		long s = System.nanoTime();
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/test/sub/나비야2.dat"));) {
			Writer w = new OutputStreamWriter(bos);
			w.write(song); 
		} catch (Exception e) {}
		long e = System.nanoTime();
		return e - s;
	}

}
