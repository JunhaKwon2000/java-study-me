package sec02.exam02.quiz;

public class TryCatchFianllyFlow {

	public static void main(String[] args) {
		
		// Quiz: 실행 흐름 예측해보기
		
		// 1. 예외가 발생하지 않은 경우
		System.out.println(1);
		try {
			System.out.println(2);			
			System.out.println(3);			
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 1 2 3 5 6
		
		System.out.println();
		
		// 2. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);			
			System.out.println(0/0); // 예외 => 발생한 예외와 일치하는 catch 블럭이 있는지 확인 => 있으면 예외를 처리 가능함
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 1 2 4 5 6
		
		System.out.println();
		
		// 3. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);			
			System.out.println(args[0]); // 예외 발생 => 발생한 예외와 일피하는 catch 블럭을 찾지 못하면 예외는 처리되지 못함
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			// 예외를 못잡아도 멈추기 직전에 finally 에 있는 실행문을 실행하고 멈춤, 주로 스캐너나 입출력 같이 예외와 무관하게 닫아줘야 하는 친구들을 여기에 넣어줌
			// finally 는 무조건 실행을 보장받음
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 1 2 5? ArrayIndexOutOfBoundsException 발생?
		
	}
	
}
