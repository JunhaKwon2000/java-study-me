package board;

import board.dto.Board;
import board.service.BoardService;
import board.service.BoardServiceImpl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static BoardService bs = new BoardServiceImpl(); // 게시판 비즈니스 로직 객체
    private static List<Board> boardList = null;
    private static Board board = null;

    /*
    * 메뉴판
    * */
    public static void menu() {
        System.out.println("========== 게시판 ==========");
        System.out.println("1. 게시글 목록");
        System.out.println("2. 게시글 조회");
        System.out.println("3. 게시글 등록");
        System.out.println("4. 게시글 수정");
        System.out.println("5. 게시글 삭제");
        System.out.println("0. 프로그램 종료");
        System.out.print("번호 입력: ");
    }

    /*
    * 게시글 목록
    * */
    public static void list() {
        System.out.println("========== 게시글 목록 ==========");
        // 게시글 목록 데이터 요청
        boardList = bs.list();
        printAll(boardList);
    }

    public static void select() {
        System.out.println("========== 게시글 조회 ==========");
        System.out.print("조회할 게시글의 번호를 입력해주세요 : ");
        int no = sc.nextInt();
        board = bs.select(no);
        print(board);
    }

    public static void insert() {
        System.out.println("========== 게시글 등록 ==========");
        Board b = input();
        int result = bs.insert(b);
        if (result > 0) System.out.println(result + "개의 행이 변환됨");
    }

    private static void update() {
        System.out.println("========== 게시글 수정 ==========");

        System.out.print("게시글 번호: ");
        int no = sc.nextInt();
        sc.nextLine();

        Board b = input();
        int result = bs.update(no, b);
        if (result > 0) System.out.println(result + "개의 행이 변환됨");
    }

    private static void delete() {
        System.out.println("========== 게시글 삭제 ==========");

        System.out.print("게시글 번호: ");
        int no = sc.nextInt();
        sc.nextLine();

        int result = bs.delete(no);
        if (result > 0) System.out.println(result + "개의 행이 변환됨");
    }



    /**
     * 글 목록 전체 출력
     * @param boardList
     */
    private static void printAll(List<Board> boardList) {
        // 글 목록이 존재하는지 확인
        if (boardList.isEmpty() || boardList == null) {
            System.out.println("조회된 글이 없습니다");
            return;
        }
        // 글 목록을 출력
        for (Board b : boardList) {
            print(b);
        }
    }

    private static void print(Board b) {
        if (b == null) {
            System.out.println("조회할 수 없는 게시글입니다.");
            return;
        }

        int no = b.getNo();
        String title = b.getTitle();
        String writer = b.getWriter();
        String content = b.getContent();
        LocalDateTime regDate = b.getRegDate();
        LocalDateTime updDate = b.getUpdDate();


        // 날짜 포맷: yyyy/MM/dd HH:mm:ss
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String reg = dtf.format(regDate);
        String upd = dtf.format(updDate);

        System.out.println("========================================");
        System.out.println("★ 글 번호: " + no);
        System.out.println("★ 제목: " + title);
        System.out.println("★ 작성자: " + writer);
        System.out.println("----------------------------------------");
        System.out.println(" " + content);
        System.out.println();
        System.out.println("★ 등록일자: " + reg);
        System.out.println("★ 수정일자: " + upd);
        System.out.println("========================================");
        System.out.println();


    }

    private static Board input() {
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        System.out.print("내용: ");
        String content = sc.nextLine();

        Board board = new Board(title, writer, content);
        return board;
    }

    public static void main(String[] args) {


        int menuNo = 0;

        while (true) {
            // 메뉴판 출력
            menu();
            
            // 메뉴 번호 입력
            menuNo = sc.nextInt();
            sc.nextLine();
            
            // 0 -> 프로그램 종료
            if (menuNo == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            // 메뉴 선택
            switch (menuNo) {
                case 1: list(); break; // 게시글 목록
                case 2: select(); break;
                case 3: insert(); break;
                case 4: update(); break;
                case 5: delete(); break;
            }
        }


    }
}
