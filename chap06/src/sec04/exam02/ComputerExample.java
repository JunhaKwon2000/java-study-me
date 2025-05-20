package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = computer.sum1(values1);
		System.out.println("결과(1): " + result1);
		
		int result2 = computer.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("결과(2): " + result2);
		
		System.out.println();
		
		// 2. 매개값으로 값의 목록과 배열 둘 다 허용
		int result3 = computer.sum2(1, 2, 3);
		System.out.println("결과(3): " + result3);
		
		int result4 = computer.sum2(1, 2, 3, 4, 5);
		System.out.println("결과(4): " + result4);
		
		// 배열을 넣어도 문제가 없음
		int[] values2 = {1, 2, 3};
		int result5 = computer.sum1(values2);
		System.out.println("결과(5): " + result5);
		
		int result6 = computer.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("결과(6): " + result6);
		
	}
	
}
