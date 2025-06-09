package pkg_homework.homwork03.controller;

import pkg_homework.homwork03.mode.dao.FileDAO;

public class FileController {

    private FileDAO fd = new FileDAO();

    public void fileSave(String file, StringBuilder sb) {
        String content = sb.toString();
        fd.fileSave(file, content);
    }

}
