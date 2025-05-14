package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		
		int v = 123;
		System.out.printf("상품의 가격: %d원\n", v);
		System.out.printf("상품의 가격: %6d원\n", v); // 앞에 공백이 들어감
		System.out.printf("상품의 가격: %-6d원\n", v); // 뒤에 공백이 들어감
		System.out.printf("상품의 가격: %06d원\n", v); // 앞에 0이 들어감
		
		double area = 3.13159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$.2f\n", 10, area); // .2f - 소수점 이하 둘째 자리까지 표시, 순번은 생략 가능
		System.out.printf("반지름이 %d인 원의 넓이: %.2f\n", 10, area); // .2f - 소수점 이하 둘째 자리까지 표시, 순번은 생략 가능(차례대로 대입됨)
		
		String name = "권준하";
		String job = "학생";
		System.out.printf(" %06d | %-10s | %10s ", 1, name, job); // 문자열은 %s
		
		
	}

}
