package sec01.exam05;

import java.util.*;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		// hashCode 랑 equals 를 오버라이드 하지 않았을 경우 2개의 객체 모두 들어감
		// hashCode 랑 equals 를 오버라이드 하면 주소는 달라도 내부 데이터가 동일한 경우 동등객체로 판단 가능(삭제, 찾기 등도 동일)
		set.add(new Member("권준하", 26));
		set.add(new Member("권준하", 26));
		set.add(new Member("권서연", 20));
		set.add(new Member("김자바", 28));
		set.add(new Member("김건담", 27));
		System.out.println(set.size() + "개의 객체 저장 -> " + set);
		
		List<Member> list = new ArrayList<Member>(set);
		Collections.sort(list);
		Set<Member> sortedSet = new LinkedHashSet<Member>(list); // 링크드 -> 정렬 유지
		
		for(Member m : sortedSet) {
			System.out.println(m.getName() + "(" + m.getAge() +"살)");
		}
		
		
		// AraayList 의 요소에서 중복 제거하기
		List<Member> test = new ArrayList<>();
		test.add(new Member("권준하", 26));
		test.add(new Member("권준하", 26));
		test.add(new Member("권서연", 20));
		test.add(new Member("김자바", 28));
		test.add(new Member("김건담", 27));
		
		Set<Member> testSet = new LinkedHashSet<>(test);
		List<Member> testArray = new ArrayList<>(testSet);
		System.out.println(testArray);
		
	}

}
