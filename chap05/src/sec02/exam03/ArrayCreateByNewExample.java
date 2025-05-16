package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		// new 연산자로 배열 생성
		int[] arr1 = new int[3];
		// 초기값 확인
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("arr1[" + i + "]: ");
			System.out.print(arr1[i] + "      ");
		}
		
		System.out.println();
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("arr1[" + i + "]: ");
			System.out.print(arr1[i] + "      ");
		}
		
	}

}
