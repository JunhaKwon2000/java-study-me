package sec01.exam05_linked;

import java.util.*;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		// HashSet
		// 요소를 추가한 순서를 보장하지 않음
		// 빠르게 요소 추가, 삭제, 검색
		Set<String> set = new HashSet<String>();
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
		// LinkedHashSet
		// 요소를 추가한 순서대로 저장됨(추가한 순서를 기억함)
		// HashSet 에 비해 메모리와 소요 시간이 많음
		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("동");
		linkedSet.add("서");
		linkedSet.add("남");
		linkedSet.add("북");
		System.out.println(linkedSet);
	}

}
