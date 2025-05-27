package sec01.exam06;

public class SmartPhone {
	
	// field
	private String company;
	
	private String os;

	
	// constructor
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}


	
	// method
	// 유익한 정보(보통 필드)를 출력할 수 있도록 함
//	@Override
//	public String toString() {
//		return company + "의 스마트폰이며 운영처재는 " + os + "를 사용하고 있습니다.";
//		
//	}
	
	// 딸깍으로도 가능
	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
	
}
