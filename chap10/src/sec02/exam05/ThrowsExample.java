package sec02.exam05;

public class ThrowsExample {
	
	public static void main(String[] args) {
		
		// 만약 메인 메서드에서 throws 를 한다면?
		// 메인 메서드를 호출한 쪽은 자바 가상 머신이므로 자바 가상 머신에게 예외를 떠넘김
		// 자바 가상 머신은 따로 예외 처리를 하는 로직이 없기 때문에 콘솔에 예외 내용을 출력하고 프로그램을 종료함
		// 실무에서는 절대 안씀
		
		try {
			findClass(); // try-catch 를 쓰지 않았을 때는 컴파일 에러 발생(Unhandled Exception)
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
			e.printStackTrace(); // 예외 스택을 출력하는 메서드, 개발 시에만 디버깅 용도로 사용함
			System.out.println(e.getMessage()); // 에외 메시지 출력, 예외를 발생시킬 때 생성자 매개값으로 사용한 메시지 리턴
			System.out.println(e.toString()); // 예외 클래스 이름 + 메시지를 출력
		}
		
		
	}

	
	// 직접 처리하지 않고 호출한 쪽에서 다양한 방식으로 처리할 수 있도록 예외 떠넘기기
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
}
