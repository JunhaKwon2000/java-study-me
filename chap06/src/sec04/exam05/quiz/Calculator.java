package sec04.exam05.quiz;

public class Calculator {

	int getEvenTotal(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) sum += i;
		}
		return sum;
	}
	
	
}
