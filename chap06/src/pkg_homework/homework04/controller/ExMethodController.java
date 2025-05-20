package pkg_homework.homework04.controller;

public class ExMethodController {

	public void printMessage (String msg) {
		System.out.println(msg);
	}
	
	public int rangeOneToHundredSum() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) sum += i;
		return sum;
	}
	
	public boolean isEven(int num) {
		if (num % 2 == 0) return true;
		else return false;
	}
	
	public boolean checkForAlphabet(String msg) {
		int cnt = 0;
		for (int i = 0; i < msg.length(); i++) {
			if ((msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z') || (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')) {
				cnt++;
				break;
			}
		}
		
		if (cnt >= 1) return true;
		else return false;
		
	}
	
	public void checkForWord(String msg, char word) {
		int cnt = 0;
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == word) cnt++;
		}
		System.out.println(msg + "에는 " + word + "가 " + cnt + "개 포함되어있습니다.");
	}
	
	public void printMultiplication(int a) {
		System.out.println("===" + a + "단===");
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " X " + i + " = " + (a * i));
		}
	}
	
	
	
}
