package sec01.exam01_2;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 타입 파라미터로 사용자 정의 객체를 사용
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("이상혁", 30));
		list.add(new Student("한덕수", 26));
		list.add(new Student("이시언", 26));
		list.add(new Student("권준하", 26));
		list.add(new Student("김기인", 28));
		
		// 객체 검색
		// 커스텀 객체 -> indexOf(), contains() 의 객체 존재 여부 판단 기준 = equals()
		// Override 필요
		if (list.indexOf(new Student("권준하", 26)) != -1) System.out.println("존재");
		else System.out.println("없음");
		
		if (list.contains(new Student("권준하", 26))) System.out.println("존재");
		else System.out.println("없음");
		
		
		// 객체 정렬
		// Wrapper class -> Collections.sort() 사용
		// Custom class -> 직접 구현(name, age, (name, age) 등)
		// 1. Custom class implements Comparable
		// 2. Comparator 사용 -> 람다식(X)
		
		// age 오름차순
		Collections.sort(list); // Override comparteTo() 기준으로 정렬
		for (Student s : list) System.out.println(s.getName() + " " + s.getAge());
		
	}
}
