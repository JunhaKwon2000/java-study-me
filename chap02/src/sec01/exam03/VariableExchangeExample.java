package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		System.out.println("[값 복사]");
		int x1 = 10;
		int x2 = 15;
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		System.out.println();
		
		x2 = x1; // 값의 복사(객체에서는 주소가 있기 때문에 주의)
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		System.out.println();
		
		// 값 교환하기
		System.out.println("[값 교환]");
		x1 = 99;
		x2 = 88;
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		
		System.out.println();
		
		int temp = x1;
		x1 = x2;
		x2 = temp;
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}

}
