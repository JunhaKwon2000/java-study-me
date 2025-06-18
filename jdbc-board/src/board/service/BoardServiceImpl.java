package board.service;

import board.dao.BoardDAO;
import board.dto.Board;

import java.util.List;

/*
* 게시판 기능 구현
* 실제 비즈니스 로직(핵심 로직)을 작성
* */
public class BoardServiceImpl implements  BoardService{

    private BoardDAO boardDAO = new BoardDAO();

    @Override
    public List<Board> list() {
        // DAO(데이터베이스에 접근하는 객체)로 게시글 목록 요청하고 List<Board>로 받아옴
        List<Board> boardList = boardDAO.list();
        
        // 핵심 비즈니스 로직(코드 로직)이 들어가는 자리
        // 지금은 그냥 반환만 하니까 없음
        
        return boardList;
    }

    @Override
    public Board select(int no) {
        // 게시글 번호(no)를 DB로 넘겨주고 게시글 정보 요청
        Board board = boardDAO.select(no);
        return board;
    }

    @Override
    public int insert(Board b) {
        // 게시글 정보를 전달하여 DB에 데이터 등록 요청
        int result = boardDAO.insert(b);
        // reuslt 가 0보다 크면 데이터 등록됨
        if (result > 0) System.out.println("데이터 등록 성공!");
        else System.out.println("데이터 등록 실패!");

        return result;
    }

    @Override
    public int update(int no, Board b) {
        int result = boardDAO.update(no, b);
        if (result > 0) System.out.println("데이터 수정 성공!");
        else System.out.println("데이터 수정 실패!");
        return result;
    }

    @Override
    public int delete(int no) {
        int result = boardDAO.delete(no);
        if (result > 0) System.out.println("데이터 삭제 성공!");
        else System.out.println("데이터 삭제 실패!");
        return result;
    }
}
