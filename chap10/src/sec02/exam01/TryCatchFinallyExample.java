package sec02.exam01;

// 일반 예외 처리
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// 이 친구는 일반 예외(Unhandled Exception)라 컴파일러가 체크하여 예외 처리 넣으라고 컴파일 에러 발생
		// 예외 처리: 예외는 발생했지만 프로그램이 종료되는 것을 막고 정상 실행 흐음을 유지하도록 하고 싶을 때 사용
		try {
			// Class clazz = Class.forName("java.lang.String"); // forName: 주어진 이름으로 클래스를 찾아서 Class 객체로 변환
			// Class clazz = Class.forName("java.lang.Stringg"); // 예외 발생 -> Catch 문으로 이동
			System.out.println("클래스를 찾았습니다.");
		} 
		catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		finally {
			// finally: optional, 예외 발생 유무와 상관없이 무조건 실행되는 코드 작성
			System.out.println("프로그램을 안전하게 종료합니다.");
		}
		
	}
	
}
