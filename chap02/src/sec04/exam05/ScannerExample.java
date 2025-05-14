package sec04.exam05;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String inpData;
//		
//		while(true) {
//			inpData = sc.nextLine();
//			
//			if (inpData.equals("q")) {
//				System.out.println("종료");
//				break;
//			}
//			
//			System.out.println("입력된 문자열: \"" + inpData + "\"");
//		}
		
		// Quiz: 2개의 integer 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + "," + b);
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " X " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / (double)b));
		
		sc.close();
		

	}

}
