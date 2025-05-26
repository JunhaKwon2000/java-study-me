package sec02.exam03;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		
		// 2가지 예외가 발생가능
		// 하나의 try catch 문으로 합치기
		// | 기호로 또는 으로 연결 가능(가능은 하다, 자주 쓰지는 않는다)
		
		try {
			// 예외 발생 가능성 1
			String data1 = args[0]; // 런타입 익셉션 발생			
			String data2 = args[1];
			
			// 예외 발생 가능성 2
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // "a20" 같이 문자가 섞이면 예외 발생			
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 캐치할 예외의 타입을 특정하면 해당 예외만 잡을 수 있음
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 파싱이 가능한 값을 넣어주세요.");
		}
		finally {
			System.out.println("다시 실행하세요.");
		}
		
	}
	
}
