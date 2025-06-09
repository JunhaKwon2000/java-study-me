package pkg_homework.homwork03.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import pkg_homework.homwork03.model.dao.FileDAO;

public class FileController {

    private FileDAO fd = new FileDAO();
    
    public boolean checkName(String file) {
    	return fd.checkName(file);
    }

    public void fileSave(String file, StringBuilder sb) {
        String content = sb.toString();
        fd.fileSave(file, content);
    }
    
    public StringBuilder fileOpen(String file) throws FileNotFoundException, IOException {
    	return fd.fileOpen(file);
    }
    
    public void fileEdit(String file, StringBuilder sb) {
    	String edit = sb.toString();
    	fd.fileEdit(file, edit);
    }

}
