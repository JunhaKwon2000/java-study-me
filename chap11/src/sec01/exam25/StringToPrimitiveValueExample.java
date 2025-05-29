package sec01.exam25;

public class StringToPrimitiveValueExample {
	
	public static void main(String[] args) {
		
		// parsing: String 을 기본 타입으로 변환
		int val1 = Integer.parseInt("10");
		System.out.println(val1);
		
		double val2 = Double.parseDouble("3.14");
		System.out.println(val2);
		
		boolean val3 = Boolean.parseBoolean("false");
		System.out.println(val3);
		
	}

}
