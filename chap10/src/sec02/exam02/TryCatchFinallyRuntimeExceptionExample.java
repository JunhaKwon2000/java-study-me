package sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0]; // 런타입 익셉션 발생			
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			// 캐치할 예외의 타입을 특정하면 해당 예외만 잡을 수 있음
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; // main 메소드 강제 종료
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // "a20" 같이 문자가 섞이면 예외 발생			
			int result = value1 + value2;
			System.out.println(result);
		} 
		catch (NumberFormatException e) {
			System.out.println("숫자로 파싱이 가능한 값을 넣어주세요.");
			return; // main 메소드 강제 종료
		}
		finally {
			System.out.println("다시 실행하세요.");
		}
		
	}
	
}
