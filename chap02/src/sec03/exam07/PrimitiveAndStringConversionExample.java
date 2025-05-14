package sec03.exam07; 
 
public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		String str1 = "10";
		// String str2 = "1A";
		// String str3 = "128";
		String bool = "false";
		
		int val1 = Integer.parseInt(str1);
		System.out.println("Value1: " + val1);
		
		double val2 = Double.parseDouble(str1);
		System.out.println("Value2: " + val2);
		
		boolean val3 = Boolean.parseBoolean(bool);
		System.out.println("Value3: " + val3);
		
		// int val4 = Integer.parseInt(str2);
		// System.out.println("Value4: " + val4); // Exception - 에외 발생(숫자로 변환 불가)
		
		// byte val5 = Byte.parseByte(str3);
		// System.out.println("Value5: " + val5); // Exception - 예외 발생(Value out of range)
		
		String str4 = String.valueOf(10);
		String str5 = String.valueOf(3.14);
		String str6 = String.valueOf(true);
		System.out.println(str4 + "GG");
		System.out.println(str5 + "LOVE");
		System.out.println(str6 + 1);
		
	}

}
