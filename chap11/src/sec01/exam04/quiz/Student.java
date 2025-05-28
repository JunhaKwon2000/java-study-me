package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	
	// field
	private int studentNo;
	private String name;
	private String major;
	
	
	
	// constructor
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
	
	
	// method
	@Override
	public boolean equals(Object object) {
		if (object instanceof Student s) {
			if ((studentNo == s.studentNo) && (name.equals(s.name))) {
				return true;
			}	
		}
		return false;
	}

	// 선생님 코드
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) return true; // 같은 참조이면 true
//		if (!(obj instanceof Student)) return false; // Student 타입이 아니면 false
//		
//		Student other = (Student) obj;
//		return this.studentNo == other.studentNo && this.name.equals(other.name);
//	}
	
	// 동등 객체를 판단할 때 equals() 를 오버라이드하면 hashCode() 도 함께 오버라이드하는 것이 일반적임
	// Objects 라이브러리 -> Object 클래스와 관련된 다양한 메서드 제공
	// Objects.hash(...) -> 자바에서 여러 필드를 조합하여 간편하게 hashCode() 를 만들 수 있도록 제공되는 유틸리티 메서드, 가변 인자를 받아서 자동으로 적절한 해시코드를 계산해줌
	// source -> generate hashcode & equals 여기서 딸깍으로 만들 수 있음
	@Override
	public int hashCode() {
		return Objects.hash(studentNo, name);
	}
	
	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}



	public char charAt(int index) {
		return major.charAt(index);
	}

}
