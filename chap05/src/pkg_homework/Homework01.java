package pkg_homework;

public class Homework01 {
	public static void main(String[] args) {
		
		
		int[] arr = {152, 180, 165, 158, 171};
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j <= (arr.length - 2) - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int items : arr) System.out.println(items);
		
	}
}
