package sec02.exam02;

public class ArrayCreateByValueExample2 {
	
	public static void main(String[] args) {
		
		// 2. 배열 변수 선언 후 나중에 값 대입 
		int[] scores;
		// scores = {10, 20, 30, 40, 50} // compile error - array constants can only be used in initializers
		scores = new int[] {83, 90, 87};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
			
		int result = add(new int[] {83, 90, 87}); // 객체로 꼭 만들어서 넘겨야댐
		int result2 = add(scores);
		System.out.println(result);
		System.out.println(result2);
		
	}
	
	
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
