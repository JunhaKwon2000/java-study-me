-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board(
	no INT AUTO_INCREMENT, 									-- 게시글 번호(PK)
    title VARCHAR(100) NOT NULL, 							-- 게시글 제목(반드시 입력)
	writer VARCHAR(100) NOT NULL, 							-- 게시글 작성자(반드시 입력)
    content TEXT, 											-- 게시글 본문
    reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, 	-- 게시글 작성일(시간 포함, 반드시 입력, 기본값 = 지금)
    -- reg_date DATE NOT NULL DEFAULT CURRENT_DATE
    upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    -- 게시글 수정일(시간 포함, 반드시 입력, 기본값 = 지금, 업데이트 시 기본값으로 지금 시간 업데이트)
    -- ON UPDATE CURRENT_TIMESTAMP: UPDATE 시 자동으로 수정 시간도 갱신
    PRIMARY KEY(no)
);

DESC board;

-- CRUD 테스트
-- 추가 (게시글 번호, 작성일, 수정일은 안넣어도 됨)
INSERT INTO board (title, writer, content) VALUES ('첫 게시글', '권준하', '게시글 본문');

-- 조회
SELECT * FROM board;
SELECT * FROM board WHERE no = 1;

-- 수정
UPDATE board SET content = '수정된 게시글 본문' WHERE no = 1;
-- 만약 테이블 만들 때 upd_date 컬럼에서 ON UPDATE CURRENT_TIMESTAMP 가 없다면
-- upd_date = now() => 수정일을 현재 시간으로 갱신
-- UPDATE board SET title = '수정된 게시글 제목', content = '수정된 게시글 본문', upd_date = now() WHERE no = 1;
SELECT * FROM board WHERE no = 1;

-- 삭제
DELETE FROM board WHERE no = 1;

INSERT INTO board (title, writer, content) VALUES ('첫 게시글', '권준하', '게시글 본문');
INSERT INTO board (title, writer, content) VALUES ('두번째 게시글', '김자바', '게시글 본문2');

-- 댓글 테이블
CREATE TABLE comment (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  board_no INTEGER NOT NULL,
  commenter VARCHAR(50),
  comment TEXT,
  reg_date DATETIME DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (board_no) REFERENCES board(no) ON DELETE CASCADE
  -- ON DELETE CASCADE: 외래키(FK)에 설정하는 옵션으로
  -- 부모 테이블의 행이 삭제될 때, 해당 행을 참조하는 자식 테이블의 행들도 자동으로 삭제
  -- 예: board의 특정 게시글이 삭제되면 그 게시글에 달린 comment들도 자동으로 삭제
);