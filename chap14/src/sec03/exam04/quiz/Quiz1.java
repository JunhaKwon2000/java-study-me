package sec03.exam04.quiz;

import java.io.File;
import java.util.UUID;

public class Quiz1 {

    public static void main(String[] args) {

        String temp = UUID.randomUUID().toString().replace("-", "");
        String uploadDirPath = "C:/test/sub/" + temp;
        File uploadDir = new File(uploadDirPath);

        if (!uploadDir.exists()) {
            boolean dirCreated = uploadDir.mkdirs();
            if (!dirCreated) {
                System.out.println("폴더 생성 실패");
                return;
            } else {
                System.out.println("폴더 생성 성공");
            }
        }

    }

}
