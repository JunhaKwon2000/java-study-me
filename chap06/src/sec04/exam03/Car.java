package sec04.exam03;

public class Car {
	
	// 필드
	int gas;
	
	// 생성자
	
	
	// 메소드
	// 연료를 주입
	public void setGas(int gas) {
		this.gas = this.gas + gas;
	}
	
	// 연료를 확인
	public boolean checkGas() {
		if (gas == 0) {
			System.out.println("연료 없음.");
			return false;
		}
		
		// if 문 조건식이 false 이면 밑에 실행문은 유효 코드(그래서 return 다음에 코드가 올 수 있음)
		System.out.println("연료 있음.(" + gas + ")");
		return true; // void 제외 타입은 꼭 return 문 작성 필요

	}
	
	// 달리기
	public void runCar() {
		while(true) {
			if (gas > 0) {
				System.out.println("달리는 중...(gas 잔량: " + gas + ")");
				gas -= 1;
			}
			else {
				System.out.println("멈춥니다....(gas 잔량: " + gas + ")");
				return; // 메소드 종료
				// break; // 가장 가까운 반복문을 빠져나감, 만약 반복문 바깥에 실행문이 있으면 실행됨
			}
		}
	}
	
}
