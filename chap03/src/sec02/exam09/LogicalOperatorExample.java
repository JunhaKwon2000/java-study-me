package sec02.exam09;

public class LogicalOperatorExample {
	
	public static void main(String[] args) {
		
		int charCode = 'A'; // 65
		System.out.println(charCode);
		
		if ((charCode >= 65) & (charCode <= 90)) { // true & true = true (& : 단축 평가 안함)
			System.out.println("대문자입니다.");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) { // false && = false (&& : 단축 평가)
			System.out.println("소문자입니다.");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) { // true && false = false
			System.out.println("숫자(0 ~ 9)입니다.");
		}
		
		System.out.println();
		
		int value = 6;
		System.out.println(value);
		
		if ((value % 2 == 0) | (value % 3 == 0)) { // true or true = true (| : 단축평가 X)
			System.out.println("2 or 3 의 배수입니다.");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) { // true or = true (|| : 단축평가)
			System.out.println("2 or 3 의 배수입니다.");
		}
		
		// 정리 - 연산의 결과는 같은데 효율성 측면에서 단축평가를 하는 &&, || 등을 사용하세요
		
	}
}
