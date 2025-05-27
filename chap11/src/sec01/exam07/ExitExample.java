package sec01.exam07;

public class ExitExample {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			if (i == 5) {
				// System 의 모든 멤버는 static, 그래서 그냥 System. 으로 메서드 접근
				System.exit(0); // 정상 종료일 경우 0, 리얼 종료(자바 가상 머신 종료)
				// break; // 애는 그냥 반복을 빠져나가는 것
			}
		}
		
		System.out.println("마무리 코드");
		
	}
	
}
