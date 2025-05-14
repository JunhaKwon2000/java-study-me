package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { // 발생한 예외를 모니터(콘솔)에 출력하고 끝내주세요
		
		int keyCode;
		
		// 키보드로부터 키코드를 읽는데 에러가 날 수 있음 -> 예외 처리 필수!
		keyCode = System.in.read(); // 콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
		System.out.println("keycode: " + keyCode);
		
		// read의 단점: enter(13, 10) 까지 읽어옴
		keyCode = System.in.read();
		System.out.println("keycode: " + keyCode);
		keyCode = System.in.read(); 
		System.out.println("keycode: " + keyCode);
	}

}
