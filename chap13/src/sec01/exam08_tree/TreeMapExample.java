package sec01.exam08_tree;

import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		
		
		// TreeMap -> key 를 기준으로 오름차순으로 정렬(내림차순도 가능)
		Map<String, Object> map = new TreeMap<>();
		
		map.put("name", "장미");
		map.put("lang", "응원");
		map.put("price", 10000);
		map.put("day", 12);
		
		System.out.println(map);
		
		// 내림차순
		Map<String, Object> map2 = new TreeMap<>(Collections.reverseOrder());
		
		map2.put("name", "장미");
		map2.put("lang", "응원");
		map2.put("price", 10000);
		map2.put("day", 12);
		
		System.out.println(map2);
		
	}
	
}
