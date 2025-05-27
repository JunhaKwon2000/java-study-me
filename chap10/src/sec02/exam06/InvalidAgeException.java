package sec02.exam06;


// 커스텀 예외 생성
// 자바에서 제공하는 표준 예외 클래스 외에, 특정 상황에 맞는 예외를 만들어야 할 때 사용
// 만드는 방법: Exception(일반 예외) 또는 RunTimeException(실행예외) 를 상속 받아서 만듬
// Exception 을 상속 받으면 일반 예외(체크 예외)
// RunTimeException 을 상속 받으면 실행 예외(체크 X 예외)
public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException(String message) {
		super(message); // 부모 생성자에 예외 메세지 전달
	}	
}
