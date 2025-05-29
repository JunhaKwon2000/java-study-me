package sec02.exam04;

public class CatchOrderExample {
	
	public static void main(String[] args) {
		
		// 다중 catch 시 순서에 주의하세요
		
		try {
			// 예외 발생 가능성 1
			String data1 = args[0]; // 런타입 익셉션 발생			
			String data2 = args[1];
			
			// 예외 발생 가능성 2
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // "a20" 같이 문자가 섞이면 예외 발생			
			int result = value1 + value2;
			System.out.println(result);
		} 
//		catch (Exception e) {
//			// 이따구로 쓰면 여기서 모든 익셉션이 싹 걸러지기 때문에 주의하세요
		
//			System.out.println("실행 매개값의 수가 부족합니다.");
			// 에러 메세지: Unreachable catch block
//		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 파싱이 가능한 값을 넣어주세요.");
		} catch (Exception e) {
			// 올바른 순서 -> 위의 2개의 익셉션이 아닌 익셉션이면 여기로
			// 모든 예외는 Exception 을 상속 받고 다형성에 의해 모든 예외 대입이 가능하므로 이놈이 맨 밑에 있어야함
			// 따라서 Exception 타입을 쓰는 경우는 예외와 상관없이 공통적으로 예외 처리를 할 때
			System.out.println("실행에 문제가 있습니다.");
		} 
		finally {
			System.out.println("다시 실행하세요.");
		}
		
	}

}
