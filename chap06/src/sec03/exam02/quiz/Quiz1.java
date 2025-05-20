package sec03.exam02.quiz;

public class Quiz1 {
	
	public static void main(String[] args) {
		
	//  Quiz
	//	실행 클래스가 실행 되도록 Computer 클래스의 생성자를 구현하시오.
	//
	//  [필드]
	//	model: 문자열
	//
	//	[출력]
	//	객체생성완료(모델: null)
	//	객체생성완료(모델: gram)
		
		Computer com1 = new Computer();
		Computer com2 = new Computer("gram");
		
		System.out.println(com1.model);
		System.out.println(com2.model);
		
	}
	
}
