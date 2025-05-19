package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student(); // Student 객체를 하나 만들고, 생성 번지를 s1에 저장
		System.out.println("student 변수가 Student 객체를 참조합니다.");
		System.out.println(student); // 객체를 문자열로 변환하여 출력(toString() 생략)
		System.out.println(student.hashCode()); // 주소값을 십진수 integer 로 반환
		
		System.out.println();
		
		Student student2 = new Student();
		System.out.println("student2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println(student2); // 객체를 문자열로 변환하여 출력(toString() 생략)
		System.out.println(student2.hashCode()); // 주소값을 십진수 integer 로 반환
		
		System.out.println();
		
		System.out.println(student == student2); // false: 서로 다른 객체를 참조함
		
	}

}
