package pkg_homework;
import java.util.Scanner;

public class Homework10 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		
		do {	
			System.out.println("게임을 실행합니다!");
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			yn = sc.next();
			
		}while(yn.equals("yes"));
		
		System.out.println("게임을 종료합니다.");
		sc.close();
		
	}
	
}
