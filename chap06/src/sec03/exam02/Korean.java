package sec03.exam02;

public class Korean {
	
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	// 생성자
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
	
	// 생성자(이렇게 하세요)
	// this 안붙이고 name = name 이렇게 하면 name 이 모두 매개변수를 가르킴
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		// 여기서 this 는 객체 자기 자신을 참조(가리킴)
		// 이게 매개변수랑 필드 이름이랑 같에 해서 할려고 쓰는거임
	}	
}
