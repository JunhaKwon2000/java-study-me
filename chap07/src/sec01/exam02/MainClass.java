package sec01.exam02;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student std1 = new Student("권준하", "001020-3XXXXXX", 1);
		
		System.out.println(std1.name);
		System.out.println(std1.ssn);
		System.out.println(std1.studentNo);
		
		// constructor order: Student() -> People() -> Student()
		// super class object is created first, and then sub class
		
		// 상속의 이점?
		// 1. 부모 클래스 재사용을 통해 빠른 개발 가능
		// 2. 중복되는 코드를 줄임
		// 3. 부모만 수정하면 자식들까지 수정되는 효과가 있어 유지 보수 편리
		
	}
}
