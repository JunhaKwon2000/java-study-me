package sec02.exam05;

public class MainArgument {

	public static void main(String[] args) {
		
		// 우리가 툴에서 Run 을 실행하는 것은 결국 명령어로 "java 클래스명" 하는 것과 동일
		
		System.out.println(args.length); // 0
		
		// 툴에서 직접 argument 를 주는 방법: Run Configurations > Arguments
		
		// String[] 배열 메개변수 활용하기
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			// JVM 강제 종료(0은 정상 종료를 의미)
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// Quiz: 문자열을 정수(integer)로 변환해서 더한 결과를 출력
		System.out.println(Integer.parseInt(strNum1) + Integer.parseInt(strNum2));

	}

}
