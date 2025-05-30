package sec01.exam01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// List 특징: 순서 O, 중복 O,
		
		// List list = new ArrayList(); // 제네릭 생략시 Object 로 간주(권장 X)
		// generic: 자바에서 클래스나 메서드가 사용할 타입을 외부에서 파라미터처럼 받아서 사용할 수 있게 해주는 문법
		// 타입 파라미터(<E>): 제네릭을 사용할 때 전달하는 타입
		// ArrayList<String> list = new ArrayList<>(); // 권장 X
		List<String> list = new ArrayList<>(); // interface 타입(다형성: List interface 의 다른 구현 클래스를 사용하게 되더라고 코드를 수정하지 않고 새로운 기능을 추가할 수 있음)
		
		// 객체 추가
		// add() <- 마지막 index 에 추가(size 넘어가는 인덱스에 접근하려하면 IndexOutOfBounds 예외 발생)
		// list.add(true); <- 안됨
		list.add("준하");
		list.add(new String("준하"));
		list.add("JAVA");
		list.add("JDBC");
		list.add("SEVLET/JSP");
		list.add(4, "DB");
		
		// 저장된 총 객체 수 얻기
		System.out.println("리스트에 저장된 총 객체 수: " + list.size());
		System.out.println();
		
		// 특정 인덱스의 객체 가져오기 + 출력하기
		System.out.println(list); // toString() Override
		System.out.println();
		
		// 객체 수정
		// 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
		list.set(list.indexOf("DB"), "Oracle DB");
		System.out.println(list);
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) System.out.println(i + "번째: " + list.get(i) + " (해시코드: " + list.get(i).hashCode() + ")");
		System.out.println();
		
		// 객체 삭제
		list.remove(list.indexOf("JAVA"));
		list.remove(2);
		list.remove("준하");
		for (int i = 0; i < list.size(); i++) System.out.println(i + "번째: " + list.get(i) + " (해시코드: " + list.get(i).hashCode() + ")");
		System.out.println();
		
		// 향상된 for 문
		for (String s : list) System.out.println(s + " (해시코드: " + s.hashCode() + ")");
		System.out.println();
		
		// 참고: forEach
		// 람다식: 함수형 프로그래밍이 가능해짐(함수를 값처럼 사용하는 것)
		// list.forEach(익명 클래스[객체] 또는 람다식 사용);
		list.forEach(t -> {
			System.out.println(t);
		});
		System.out.println();
		
		// 객체 검색
		if (!list.isEmpty()) {// 컬렉션이 비어 있는지 조사
			System.out.println("Oracle DB 가 저장되어 있나요? : " + list.contains("Oracle DB") + "(" + list.indexOf("Oracle DB") +")");
			System.out.println("DB 가 저장되어 있나요? : " + list.contains("DB") + "(" + list.indexOf("DB") +")");
		}
		else {
			 System.out.println("리스트가 비어있습니다.");
		}
		System.out.println();
		
		// 저장된 모든 객체 삭제
		list.clear();
		System.out.println("총 객체 수: " + list.size());
		System.out.println();
		
		// 요소 정렬
		List<String> strList = new ArrayList<String>();
		strList.add("나");
		strList.add("가");
		strList.add("사");
		strList.add("라");
		strList.add("마");
		System.out.println("origin: " + strList);
		Collections.sort(strList);
		System.out.println("asc: " + strList);
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println("desc: " + strList);
		
		System.out.println();
		
		List<Integer> numList = new ArrayList<>();
		numList.add(11);
		numList.add(15);
		numList.add(4);
		numList.add(8);
		numList.add(5);
		System.out.println("origin: " + numList);
		Collections.sort(numList);
		System.out.println("asc: " + numList);
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println("desc: " + numList);
		
		
	}
	
}
