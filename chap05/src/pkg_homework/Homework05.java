package pkg_homework;
import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		
		String[] choices = {"가위", "바위", "보"};
		int winCnt = 0;
		int drawCnt = 0;
		int loseCnt = 0;
		
		// System.out.println((int)(Math.random() * 3) + 1);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int choice = (int)(Math.random() * 3);
			
			System.out.print("가위바위보 : ");
			String myChoice = sc.nextLine();
			
			if (myChoice.equals("가위")) {
				System.out.println("컴퓨터 : " + choices[choice]);
				System.out.println("사용자 : " + myChoice);
				if (choices[choice].equals("가위")) {
					System.out.println("비겼습니다");
					drawCnt++;
				}
				else if (choices[choice].equals("바위")) {
					System.out.println("졌습니다 ㅠㅠ");
					loseCnt++;
				}
				else if (choices[choice].equals("보")) {
					System.out.println("이겼습니다 !");
					winCnt++;
				}
				
			}
			else if (myChoice.equals("바위")) {
				System.out.println("컴퓨터 : " + choices[choice]);
				System.out.println("사용자 : " + myChoice);
				if (choices[choice].equals("바위")) {
					System.out.println("비겼습니다");
					drawCnt++;
				}
				else if (choices[choice].equals("보")) {
					System.out.println("졌습니다 ㅠㅠ");
					loseCnt++;
				}
				else if (choices[choice].equals("가위")) {
					System.out.println("이겼습니다 !");
					winCnt++;
				}
				
			}
			else if (myChoice.equals("보")) {
				System.out.println("컴퓨터 : " + choices[choice]);
				System.out.println("사용자 : " + myChoice);
				if (choices[choice].equals("보")) {
					System.out.println("비겼습니다");
					drawCnt++;
				}
				else if (choices[choice].equals("가위")) {
					System.out.println("졌습니다 ㅠㅠ");
					loseCnt++;
				}
				else if (choices[choice].equals("바위")) {
					System.out.println("이겼습니다 !");
					winCnt++;
				}
				
			}
			else if (myChoice.equals("stop")) {
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}
		
		System.out.println((winCnt + drawCnt + loseCnt) + "전 " + winCnt + "승 " + drawCnt + "무 " + loseCnt + "패");
		
		sc.close();
		
	}
}
