package pkg_homework.homwork03.mode.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file){ 
	  // File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌 
	  // 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		File check = new File(file);
		return check.exists();
	}
	public void fileSave(String file, String s) { 
	  // 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고 
	  // String에 써서 저장
		File save = new File("C:\\Users\\권준하\\OneDrive\\Desktop\\" + file);
		try {save.createNewFile();} 
		catch (IOException e) {e.printStackTrace();}
		try(FileWriter w = new FileWriter(save)) {
			w.write(s);
		} catch(Exception e) {}
		
	} 
	public StringBuilder fileOpen(String file) throws IOException{ 
	  	// 매개변수로 들어온 file로 파일을 찾아 StringBuilder에 값들 저장하여 반환
		StringBuilder sb = new StringBuilder();
		File open = new File(file);
		BufferedReader br = new BufferedReader(new FileReader(open));
		sb.append(br.readLine());
		return sb;
	} 
	public void fileEdit(String file, String s){ 
	  // 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고 
	  // String에 써서 저장하되 이어서 저장될 수 있도록 함 
	} 
	
	}
