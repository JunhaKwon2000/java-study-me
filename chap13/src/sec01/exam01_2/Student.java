package sec01.exam01_2;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	// field
	private String name;
	
	private int age;
	
	// constructor
	public Student() {}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// method
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		// if (getClass() != obj.getClass()) return false;
		if (!(obj instanceof Student)) return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student other) {
		
		// 로직 -> return 값이 (-) - this 가 앞으로, return 값이 (+) - this 가 뒤로

		// 나이 오름차순(1)
		// return 음수 -> this < other - this 가 앞으로
		// return 양수 -> this > other - this 가 뒤로
		// return 0 -> this == other - 순서 유지
		// return age - other.age; // 정렬의 기준을 마련
		
		// 나이 오름차순(2)
		// if (age < other.age) return -1;
		// else if (age > other.age) return 1;
		// else return 0;
		
		
		// 나이 내림차순
		// return -(age - other.age);
		
		// 문자열 오름차순
		// String 의 재정의된 compareTo() 메서드 사용
		// 기준 문자열이 사전상 뒤면 자리 바꿈
		// 기준 문자열이 사전상 앞이면 그대로 유지
		// return name.compareTo(other.name);

		// 문자열 내림차순
		// return -name.compareTo(other.name);
		
		
		// 복합 비교
		if (age == other.age) {			
			return name.compareTo(other.name);
		}
		else {
			return age - other.age;
		}
	}


	
}
