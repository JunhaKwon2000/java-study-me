package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		// Escape 문자 - \ 가 붙은 문자(특수용도)
		
		System.out.println("변호\t이름\t직업");
		System.out.println("변호\n이름\n직업");

		System.out.println();
		
		// println - 줄바꿈 O
		// print - 줄바꿈 X
		
		System.out.print("안녕\n");
		System.out.print("안녕\n");
		System.out.print("안녕\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄 \\ 여름 \\ 가을 \\ 겨울");
	}

}
