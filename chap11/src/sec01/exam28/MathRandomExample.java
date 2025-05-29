package sec01.exam28;

public class MathRandomExample {

	public static void main(String[] args) {
		
		// (int) (Math.random() * (max - min + 1)) + min
		
		// 1 ~ 10
		for (int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 10) + 1;
			System.out.print(random + " ");
		}
		
		System.out.println();
		
		// Quiz: 주사위 (1 ~ 6)
		for (int i = 0; i < 10; i++) {
			int random = (int)(Math.random() * 6) + 1;
			System.out.print(random + " ");
		}
		
		System.out.println();
		
		// Quiz: 로또 (1 ~ 45)
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45) + 1;
			System.out.print(random + " ");
		}
		
	}
	
}
