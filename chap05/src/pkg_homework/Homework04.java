package pkg_homework;

public class Homework04 {
	
	public static void main(String[] args) {
		
		
		int[] arr = {(int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1};
		// int[] arr = {2, 2, 2, 2, 2};
		while (true) {
			int cnt = 0;
			
			label: for (int i = 0; i < arr.length; i++) {
				cnt++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						arr = new int[]{(int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1, (int)(Math.random() * 45) + 1};
						cnt = 0;
						break label;
					}
				}
				
			}
			
			if (cnt == arr.length) break; 
			
		}
		
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
