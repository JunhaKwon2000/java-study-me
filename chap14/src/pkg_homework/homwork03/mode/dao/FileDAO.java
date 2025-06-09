package pkg_homework.homwork03.mode.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 학원 컴퓨터 경로: "C:\\Users\\JUNHA\\Desktop\\"

public class FileDAO {
	
	public boolean checkName(String file){ 
		File check = new File("C:\\Users\\JUNHA\\Desktop\\" + file);
		return check.exists();
	}
	public void fileSave(String file, String s) { 
		File save = new File("C:\\Users\\JUNHA\\Desktop\\" + file);
		try {save.createNewFile();} 
		catch (IOException e) {e.printStackTrace();}
		try(FileWriter w = new FileWriter(save)) {
			w.write(s);
		} catch(Exception e) {}
	} 
	
	public StringBuilder fileOpen(String file) throws FileNotFoundException, IOException{ 
		StringBuilder sb = new StringBuilder();
		File open = new File("C:\\Users\\JUNHA\\Desktop\\" + file);
		try(BufferedReader br = new BufferedReader(new FileReader(open))) {
			int cnt = 0;
			while (true) {
				cnt++;
				String lines = br.readLine();
				if (lines == null) break;
				if (cnt >= 2) sb.append("\n" + lines);
				else sb.append(lines);
			}
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		File edit = new File("C:\\Users\\JUNHA\\Desktop\\" + file);
		try(FileWriter w = new FileWriter(edit, true)) {
			w.write(s);
		} catch(Exception e) {}
	}
	
}
