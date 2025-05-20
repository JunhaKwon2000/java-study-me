package pkg_homework.homework03.util;

public class Util {

	public String concat(String a, String b) {
		return a + b;
	}
	
	public int conditionalMultiply(int a, int b) {
		if (a < b) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		else {
			return a * b;
		}
	}
	
	public boolean compareString(String a, String b) {
		if (a.equals(b)) return true;
		else return false;
	}
	
}
