package sec01.exam06;

import java.util.*;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		// Map
		// key-value 자료구조
		// key 는 중복 불가, value 는 중복 가능
		// 순서 보장 여부는 구현체에 따라 다름
		
		// HashMap
		// 가장 많이 쓰이는 Map
		// key 의 hashCode() 를 사용(위치 특정)
		// 순서 보장 X
		
		// Map 생성
		// key 로 String, Integer(Long) 을 많이 씀(hashCode(), equals() 가 이미 오버라이드 되어있음)
		// 커스텀 객체는 직접 hashCode() 랑 equals() 를 오버라이드 해야 정상적으로 메서드들이 동작
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		// put() 은 내부적으로 key 가 이미 존재하는지 확인
		// 존재하지 않으면 새로 추가하고 null 반환
		// 존재하면 값을 덮어쓰고, 덮어쓰기 전의 값을 반환
		map.put("권준하", 95);
		map.put("김재현", 85);
		map.put("동장군", 80);
		map.put("홍길동", 90);
		map.put("홍길동", 95); // key 가 동일하면 기존의 값을 오버라이드(값만 대체)
		System.out.println("총 엔트리 수: " + map.size());
		
		// 객체 찾기
		// key 값으로 value 를 검색 (찾지 못하면 null 을 반환)
		System.out.println(map.get("권준하"));
		System.out.println(map.get("김재현"));
		System.out.println(map.get("홍길동"));
		
		// 객체를 하나씩 꺼내오기(및 처리)
		// Iterator(반복자) - Collection 내부의 요소를 하나씩 순회할 수 있도록 도와주는 인터페이스
		// Iterator 를 쓰려면 해당 객체가 반복가능해야함(반복 가능 여부는 Iterable 인터페이스 구현여부로 확인가능)
		// Collection(Collection 은 애초에 extends Iterable 임) 을 구현한 클래스들(ArrayList, HashSet 등등) Java 의 대부분의 Collection 은 이미 Iterable 을 구현(간접 구현)하고 있음
		// Map 은 Iterable 을 구현하고 있지 않음, 그래서 맵의 구성요소를 set 으로 바꾼 다음 하나씩 조회 가능 -> entrySet()
		
		// 1. keySet() 이용: Key 만 Set 으로 변환
		// return 타입은 Set -> Set<Key 의 타입>
		// Key 만 모은 Set 이 필요할 때 사용
		System.out.println();
		System.out.println("keySet() - Iterator 사용");
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key: " + key + ", value: " + map.get(key));
		}
		
		// Quiz: 향상된 for 문으로 객체를 하나씩 처리
		// 읽기 전용으로 순회할 때는 대부분 이 방식을 더 선호
		System.out.println();
		System.out.println("keySet() - 향상된 for 문 사용");
		for (String key : keySet) System.out.println("key: " + key + ", value: " + map.get(key));
		
		// 2. entrySet() 이용: 
		Set<Map.Entry<String, Integer>> entries = map.entrySet();

		System.out.println();
		System.out.println("entrySet() - Iterator 사용");
		Iterator<Map.Entry<String, Integer>> iter = entries.iterator();
		while (iter.hasNext()) {
			// 반복해서 Map.Entry 를 얻고 getter 로 key 와 value 를 얻기
			Map.Entry<String, Integer> entry = iter.next();
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
			// iter.remove(); // 문제 없음(next() 로 가져온 놈을 삭제)
		}
		
		// Quiz: 향상된 for 문으로 객체를 하나씩 처리
		// 읽기 전용으로 순회할 때는 대부분 이 방식을 더 선호
		System.out.println();
		System.out.println("entrySet() - 향상된 for 문 사용");
		for (Map.Entry<String, Integer> entry : entries) {
			// map.remove(entry.getKey()); // ConcurrentModificationException 발생
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
		
		// 객체 삭제
		// remove(key) -> Map.Entry 제거
		System.out.println();
		map.remove("홍길동");
		System.out.println("총 엔트리 수: " + map.size());
		
		// 정리: Iterator가 필요한 상황(for-each보다 유리한 경우)
		// 읽기 전용이면 for-each가 가장 깔끔하고 실용적
		// 수정, 삭제, 조건 제어 등 복잡한 순회가 필요하면 Iterator가 더 유리
		// Iterator는 반복 중 컬렉션의 구조 변경을 감지 가능
		// 예: 순회 중 요소를 안전하게 제거할 때
		// Iterator.remove()는 ConcurrentModificationException 없이 안전하게 삭제 가능
		// 반면 for-each에서 map.remove()를 쓰면 오류 발생 가능
		
		// 객체 검색
		// 
		
	}

}
