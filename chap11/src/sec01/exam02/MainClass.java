package sec01.exam02;

public class MainClass {

	public static void main(String[] args) {
		
		// m1 과 m2 는 물리적으로 다름, 하지만 논리적으로는 같은 객체
		Member m1 = new Member("red");
		Member m2 = new Member("red");
		Member m3 = new Member("blue");
		
		// equals 오버라이드 안했을 때: false, false
		// equals 오버라이드 했을 때: true, false
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}
	
}
