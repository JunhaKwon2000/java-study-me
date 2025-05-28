package sec01.exam14;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVal1 = new String("준하");
		String strVal2 = "준하";
		String strVal3 = "준하";
		
		if (strVal1 == strVal2) System.out.println("같은 객체 참조중");
		else System.out.println("다른 객체 참조중");
		
		if (strVal2 == strVal3) System.out.println("같은 객체 참조중");
		else System.out.println("다른 객체 참조중");
		
		if (strVal1.equals(strVal2)) System.out.println("같은 문자열");
		else System.out.println("다른 문자열");
		
		if (strVal2.equals(strVal3)) System.out.println("같은 문자열");
		else System.out.println("다른 문자열");
		
		
	}
	
}
