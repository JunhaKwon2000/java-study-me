package pkg_homework.homwork03.view;

import java.util.Scanner;

import pkg_homework.homwork03.controller.FileController;

public class FileMenu {

    private Scanner sc = new Scanner(System.in);
    private FileController fc = new FileController();

    public void mainMenu() {
        while (true) {
            System.out.println("***** My Note ***** ");
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: fileSave(); break;
                case 2: break;
                case 3: break;
                case 9: System.out.println("프로그램을 종료합니다."); return;
                default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");break;
            }
        }

    }

    public void fileSave() {
        StringBuilder sb = new StringBuilder();
        while (true) {
            System.out.println("파일에 저장할 내용을 입력하세요.");
            System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
            System.out.print("내용 : ");
            String content = sc.nextLine();
            if (content.equals("exit")) break;
            sb.append(content);
        }
        System.out.print("저장할 파일 명을 입력해주세요.(ex. myFile.txt) : ");
        String fileName = sc.nextLine();
        fc.fileSave(fileName, sb);
        
    }

}
