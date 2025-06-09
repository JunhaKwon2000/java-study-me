package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
	
	public void deleteFile(File dir) {
		
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println(file.getPath() +" -> 삭제 안됨");
				} else {
					if (file.delete()) {
						System.out.println(file.getPath() +" -> 삭제 완료");					
					}
				}
			}
		}
		else System.out.println("폴더가 아닙니다.");
	}

}
