package ex;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	
		RunEx runHW = new RunEx();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실행할 기능을 선택하세요.\r\n"
				+ "1. 놀이동산 입장료 계산하기\r\n"
				+ "2. 일기예보\r\n"
				+ "3. 세개의 정수 비교하기\r\n"
				+ "4. 철수네 공장\r\n"
				+ "5. 헬스 마니아 철수\r\n"
				+ "6. 합격인가? 불합격인가?\n");
		
		System.out.print("선택 : ");
		int choice = scanner.nextInt();
		
		if (choice == 1) System.out.println("===1.놀이동산===");
		else if (choice == 2) System.out.println("===2.일기예보===");
		else if (choice == 3) System.out.println("===3.최소값 찾기===");
		else if (choice == 4) System.out.println("===4.철수네 공장===");
		else if (choice == 5) System.out.println("===5.헬스 마니아===");
		else if (choice == 6) System.out.println("===6.합격?불합격?===");
				
		runHW.run(choice);
		
		scanner.close();

	}

}
