package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		
		int val = 10 + 2 + 8;
		System.out.println("Value: " + val);
		
		String str1 = 10 + 2 + "8"; // 128
		System.out.println("Value: " + str1);
		
		String str2 = 10 + "2" + 8; // 1028
		System.out.println("Value: " + str2);

		String str3 = "10" + 2 + 8; //1028
		System.out.println("Value: " + str3);
		
		String str4 = "10" + (2 + 8); //1010
		System.out.println("Value: " + str4);
		
	}

}