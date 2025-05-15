package sec01.exam01;

public class IfExample {
	public static void main(String[] args) {
		
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A 입니다.");
		}
		else { 
			System.out.println("점수가 90점 이하입니다."); // {} 생략시 이 친구만 else 로 바인딩됨(다음 실행문 한개)
			System.out.println("등급은 A가 아닙니다.");
		}
		
		// 코드가 아직 익숙하지 않을 때는 실행문이 하나뿐인 경우에도 중괄호 써주기!
	}
}
