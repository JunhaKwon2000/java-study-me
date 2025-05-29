package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		// Date 클래스
		Date now = new Date();
		System.out.println(now); // toString() 메서드 오버라이드
		
		// 날짜 출력 포맷 커스텀
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE a hh시 mm분 ss초");
		System.out.println(sdf.format(now)); // format(Date date) 으로 포맷된 String return
		
		// 참고
		// 주요 포맷 문자와 자주 쓰는 패턴
		// y: 연도(year) -> yyyy: 4자리 연도
		// M: 월(month) -> MM: 2자리 월(01~12)
		// d: 일(day) -> dd: 2자리 일
		// E: 요일(day name) -> E: 요일 약어, EEEE: 요일 전체 이름
		// a: 오전/오후(AM/PM)
		// H: 시(0~23시) -> HH: 24시간제 시(00~23)
		// h: 시(1~12시) -> hh: 12시간제 시(01~12)
		// m: 분(minute) -> mm: 2자리 분
		// s: 초(second) -> ss: 2자리 초
		// S: 밀리초
		
		// HH는 24시간제, hh는 12시간제(a와 함께 사용해야 오전/오후 구분 가능)
		// 대소문자를 구분합니다 (MM은 "월", mm은 "분")
		
		// 각자 테스트
		sdf = new SimpleDateFormat("오늘은 yy년 MM월 dd일(E) 입니다! 현재 시간은 HH시 mm분 이네요");
		System.out.println(sdf.format(now));
		
		System.out.println();
		
		// 참고: 자바 8 이후 권장 방식(java.time API)
		// Date 대신 LocalDate, LocalDateTime, ZonedDateTime 등을 사용 권장
		// SimpleDateFormat 대신 DateTimeFormatter 사용 권장
		// 훨씬 더 안전하고 직관적이면 사용성이 좋음
		// 날짜·시간 조작, 포맷팅, 시간대 처리 모두 훨씬 쉽고 명확함
		
		// 1. LocalDate
		// 날짜(년, 월, 일) 정보만 가짐
		// 시간 정보 없음
		// 시간대 정보 없음
		// 생일, 기념일, 마감일 등 "날짜만 필요한 경우"에 사용
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().getYear());
		System.out.println();
		
		// 2. LocalDateTime
		// 날짜 + 시간(시, 분, 초, 나노초) 정보를 가짐
		// 시간대 정보 없음
		// 로그 생성 시간, 예약 시간 등 "날짜 + 시간"이 필요한 경우 사용
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().getHour());
		System.out.println();
		
		// 3. ZonedDateTime
		// 날짜 + 시간 + 시간대(ZoneId) 정보를 모두 포함
		// 표준 시간대 간의 변환 필요할 때 사용
		// 서버 간 시간 동기화, 국제화 시스템 등에 유용
		System.out.println(ZonedDateTime.now());
		System.out.println(ZonedDateTime.now().getZone());
		System.out.println();
		
		// 4. DateTimeFormatter
		// 날짜/시간 -> 문자열 또는 문자열 -> 날짜/시간 변환에 사용
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(dtf.format(ZonedDateTime.now()));
		System.out.println(ZonedDateTime.now().format(dtf));
	}
	
}
