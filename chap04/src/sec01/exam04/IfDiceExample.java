package sec01.exam04;

public class IfDiceExample {
	public static void main(String[] args) {
		
		// int num = Math.floor(Math.random() * 6) + 1;
		// Math.random() - 0.0 이상 1.0 미만의 임의의 실수값(double)을 반환
		// Math.random() * 6 - 0.0 이상 6.0 미만의 임의의 실수값(double)을 반환
		// (int)(Math.random() * 6) - 0 이상 6 미만의 임의의 정수값(int)을 반환
		// Math.floor(Math.random() * 6) + 1 - 1 이상 7 미만의 임의의 정수값(double)을 반환 -> 주사위!
		
		int num;
		for (int i = 0; i < 21; i++) {
			num = (int)(Math.random()* 6) + 1;
			if (num == 1) {
				System.out.println("1번이 나왔습니다.");
			}
			else if (num == 2) {
				System.out.println("2번이 나왔습니다.");
			}
			else if (num == 3) {
				System.out.println("3번이 나왔습니다.");
			}
			else if (num == 4) {
				System.out.println("4번이 나왔습니다.");
			}
			else if (num == 5) {
				System.out.println("5번이 나왔습니다.");
			}
			else if (num == 6) {
				System.out.println("6번이 나왔습니다.");
			}
		}

	}
}
