package sec02.exam02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

	public static void main(String[] args) {
		
		// Calendar: 추상 클래스여서 new 연산자로 직접 객체 생성 불가, getInstance() 메서드로 객체 생성(Calendar 의 자식 객체를 return)
		Calendar now = Calendar.getInstance();
		// now.get(int field) 메서드의 리턴값은 integer 형
		
		System.out.print(now.get(Calendar.YEAR) + "년 "); // Calendar.YEAR = 1 -> now.get(1) -> year 정보 return
		System.out.print(now.get(Calendar.MONTH) + 1 + "월 "); // 0: 1월, 11: 12월 		
		System.out.print(now.get(Calendar.DAY_OF_MONTH) + "일 "); // 일: 1 ~ 31
		
		String week = null;
		switch (now.get(Calendar.DAY_OF_WEEK)) { // 요일: 1(SUN) ~ 7(SAT)
			case Calendar.SUNDAY: week = "일"; break;
			case Calendar.MONDAY: week = "월"; break;
			case Calendar.TUESDAY: week = "화"; break;
			case Calendar.WEDNESDAY: week = "수"; break;
			case Calendar.THURSDAY: week = "목"; break;
			case Calendar.FRIDAY: week = "금"; break;
			case Calendar.SATURDAY: week = "토"; break;
		}
		System.out.print(week + "요일 ");
		
		// System.out.println(now.get(Calendar.AM_PM)); // 0(오전), 1(오후)	
		String strAmPm = now.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후";
		System.out.print(strAmPm + " ");
		
		System.out.print(now.get(Calendar.HOUR) + "시 ");
		System.out.print(now.get(Calendar.MINUTE) + "분 ");
		System.out.print(now.get(Calendar.SECOND) + "초 ");
		
		System.out.println();
		
		// 참고: 지비 8 이후 권장 방식
		// Calendar 대신 java.time API 로 대체 가능
		
		// 1. 현재 날짜와 시간 얻기
		LocalDateTime today = LocalDateTime.now();
		
		// 2. 날짜 구성 요소 얻기
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		
		DayOfWeek weekTodayTemp = today.getDayOfWeek(); // DayOfWeek: enum type(MONDAY ~ SUNDAY)
		String weekToday = weekTodayTemp.getDisplayName(TextStyle.SHORT, Locale.KOREAN); // MONDAY -> 월
		
		int hour = today.getHour(); // 0 ~ 23
		String ampm = hour >= 12 ? "오후" : "오전";
		int hour12 = hour >= 13 ? hour - 12 : (hour == 0 ? hour = 12 : hour);
		
		int minute = today.getMinute();
		int second = today.getSecond();
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + weekToday + "요일 " + ampm + " " + hour12 + "시 " + minute + "분 " + second + "초");
		
		// 날짜 더하기/빼기: plusDays(), minusDays()
		LocalDateTime plusDays = today.plusDays(3); // 3일 후
		System.out.println(plusDays);
		
		// 날짜/시간 비교: isBefore(), isAfter(), isEqual()
		// 날짜 비교
		LocalDate nowDay = LocalDate.now();
		LocalDate targetDay = LocalDate.of(2025, 12, 25); // 2025년 12월 25일
		
		if (nowDay.isBefore(targetDay)) { // targetDay 보다 nowDay 가 이전인지
			System.out.println("오늘은 크리스마스 이전입니다.");
		}
		else if (nowDay.isAfter(targetDay)) { // targetDay 보다 nowDay 가 이후인지
			System.out.println("오늘은 크리스마스 이후입니다.");			
		}
		else {
			System.out.println("오늘은 크리스마스입니다!");
		}
		
		// 시간 비교
		LocalDateTime todayTime = LocalDateTime.now();
		LocalDateTime deadLine = LocalDateTime.of(2025, 5, 29, 18, 0); // 25년 5월 29일 18시 0분
		
		if (todayTime.isBefore(deadLine)) {
			System.out.println("마감 시간 전입니다. 작업을 계속하세요.");
		}
		else if (todayTime.isAfter(deadLine)) {			
			System.out.println("마감 시간이 지났습니다. 제출을 마감합니다.");
		}
		else {
			System.out.println("지금이 마감 시간입니다!");
		}
		
		// 날짜/시간 차이 구하기: Period.between(), Duration.between()
		// 날짜 차이
		LocalDate startDate = LocalDate.of(2025, 4, 7);
		LocalDate endDate = LocalDate.of(2025, 10, 24);
		Period period = Period.between(startDate, endDate);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());

		
		// 시간 차이
		LocalTime start = LocalTime.of(10, 0, 0); // 10시 0분 0초
		LocalTime end = LocalTime.of(10, 5, 30); // 10시 5분 30초
		
		Duration duration = Duration.between(start, end);
		System.out.println("총 초: " + duration.getSeconds());
		System.out.println("총 분: " + duration.toMinutes());
		
		
		// 전체 일수 차이 계산: ChronoUnit
		// 두 날짜/시간 사이의 차이를 원하는 단위로 바로 계산
		// 사용 가능한 단위: DAYS, WEEKS, MONTHS, YEARS
		long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(startDate + " ~ " + endDate + " 사이의 일 수: " + daysBetween);
		
	}
	
}
