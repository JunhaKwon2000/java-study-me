package sec01.exam04;

import java.util.*;

// Hashset: 특정 상황에서만 사용, arraylist 보다는 사용 빈도 낮음
// 특정 상황: 중복된 데이터 제거(ArrayList의 요소에서 중복을 제거할 때)
public class HashSetExample {

	public static void main(String[] args) {
		
		// Set: 수학에서 집합, 순서 없이 데이터 저장(순서대로 꺼내기 불가능)
		// 가끔 우연히 순서대로 꺼내올 때도 있는데 이때는 우연히 해시 툴돌이 없었거나 JVM 내부 해시 구현에 의해 우연히 정렬된 것처럼 출력된 것일 뿐 순서를 보장하지 않음
		// 동일한 요소 중복 저장 불가능(null 도 딱 하나만)
		// 중복 판단 기준: 해시코드로 객체의 위치 찾기 -> 만약 해시 코드가 같다면 equals() 로 내부 값까지 동일한지 확인 -> 둘 다 같으면 동등 객체(동일 객체는 아님, 주소값은 다름)
		
		// 1. set 생성
		Set<String> set = new HashSet<>();
		
		// 2. 데이터 추가
		set.add("Java");
		set.add("JDBC");
		set.add("JSP/Servlet");
		set.add("Java"); // 추가 안됨
		set.add("iBatis");		
		System.out.println(set);
		
		// 3. 저장된 총 객체 수
		System.out.println("총 객체 수: " + set.size());
		
		// 4. Iterator(반복자)로 모든 객체를 하나씩 가져오기(컬렉션의 요소를 순회할 수 있도록 도와주는 인터페이스), HashSet 처럼 순서가 없는 컬렉션 내부의 요소를 순차적으로 접근할 수 있도록 도와줌, 타입 파라미터는 지정된 객체와 동일하게 작성
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// hasNext() 로 가져올 객체가 있는지 확인, next() 로 커서를 직접 이동(커서는 항상 객체의 앞에 있음)
			System.out.print(iterator.next() + " ");
			// 커서는 첫 요소 이전 위치에 있음, next() 호출하면 커서가 다음 위치로 이동하면서 그 요소를 반환함
			
			// remove(): next() 로 반환한 요소를 제거
			// iterator.remove();
			// 참고: remove() 는 next() 호출 이후에만 호출 가능하며, 한 번만 가능
		}
		
		// 5. 객체 삭제
		set.remove("iBatis"); // 인덱스 없음
		set.remove("JDBC"); // 인덱스 없음
		System.out.println("\n" + set);
		System.out.println("총 객체 수: " + set.size());
		
		// 6. 향상된 for 문으로 객체 하나씩 가져오기(index 가 없어서 일반 for 문은 안됨)
		for (String s : set) System.out.print(s + " ");
		System.out.println();
		
		// 7. 모든 객체 제거하고 비우기
		set.clear();
		System.out.println("총 객체 수: " + set.size());
		if (set.isEmpty()) System.out.println("아무것도 없음");
		
		// 8. HashSet 과 집합
		// 수학의 집합을 효율적으로 처리하기에 적합한 구조
		// 두 집합의 합집합, 교집합, 차집합 연산 가능
		Set<Integer> test1 = new HashSet<>();
		test1.add(1);
		test1.add(2);
		test1.add(3);
		
		Set<Integer> test2 = new HashSet<>();
		test2.add(2);
		test2.add(3);
		test2.add(4);
		
		// 합집합(UNION)
		// test1.addAll(test2); 
		// System.out.println(test1);
		
		// 교집합(INTERSECT)
		// test1.retainAll(test2);
		// System.out.println(test1);
		
		// 차집합(MINUS, EXCEPT)
		// test1.removeAll(test2);
		// System.out.println(test1);
		
		// 주의: 위 3개의 메서드 모두 기준이 되는 set 을 변경함(원본 변경, 새로운 set 반환 X, 만약 변수에 담고 싶다면 비어있는 set 하나 만들고 여따 싹 복사한 후 이걸로 하셈)
		
		// 중복 제거
		List<String> list = new ArrayList<String>();	
		list.add("Java");
		list.add("Java");
		System.out.println(list);
		
		Set<String> test = new HashSet<String>();
		for (String s : list) test.add(s);
		System.out.println(test);
	}
	
	
}
