package sec01.exam07;

import java.util.*;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		
		// new 연산자로 생성했기 때문에 서로 다른 객체
		// 내부 데이터가 같으므로 동등 키로 판단
		// 객체의 hashCode() 와 equals() 를 기준으로 판단
		map.put(new Student(1, "김재현"), 95);
		map.put(new Student(1, "김재현"), 98); // 동일 key -> 기존 value 를 오버라이드(기존 Entry 의 값만 대체되는거임)
		map.put(new Student(2, "권준하"), 97);
				
		System.out.println("총 Entry 수: " + map.size());
		System.out.println(map.get(new Student(1, "김재현")));
		
	}

}
