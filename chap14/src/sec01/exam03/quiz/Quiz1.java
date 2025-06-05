package sec01.exam03.quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Quiz1 {
	
	public static void main(String[] args) {
		
		String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
				+ "\n우리나라 만세 무궁화 삼천리 화려강산"
				+ "\n대한사람 대한으로 길이 보전하세";
				
		try (OutputStream os = new FileOutputStream("C:/Windows/Temp/애국가1.dat")) {
			os.write(song.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
