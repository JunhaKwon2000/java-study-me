package board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
* 게시글 정보
* (실제 데이터베이스의)board 테이블과 일치시켜주는 것이 좋음
*               DB(컬럼)            JAVA (필드)
* - 게시글 번호  no                  no
* - 제목        title               title
* - 작성자      writer              writer
* - 내용        content             content
* - 등록일자     reg_date            regDate
* - 수정일자     upd_date            updDate
* 
* 이게 보니까 이 Board 객체를 DB 에서 하나의 row 에 대응시키는거네
* 그리고 이 객체를 가지고 자바에서 이것저것 하는거임
* 반대로 이 객체를 DB 에다 넣을 수도 있는거임
* DB 에서 잘 가져오면 DTO 객체에 잘 매핑해서 담을 예정 (DB에 넣을 때도 마찬가지)
* 컬렉션에 담으면 게시글 목록이 됨
*
* */
// 롬복 어노테이션을 써서 코드로 안써도 됨
@Data
@AllArgsConstructor
public class Board {

    private int no;
    private String title;
    private String writer;
    private String content;
    private LocalDateTime regDate;
    private LocalDateTime updDate;

    public Board() {
        this("(제목 없음)", "(작성자 없음)", "");
    }

    public Board(String title, String writer, String content) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    
}
