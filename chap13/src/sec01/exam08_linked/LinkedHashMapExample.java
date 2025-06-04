package sec01.exam08_linked;

import java.util.*;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		// HashMap -> 순서를 보장하지 않음
		
		// LinkedHashMap -> 순서를 보장함(데이터가 들어온 순서, 순서가 중요한 경우에 사용)
		
		Map<String, Object> flower = new LinkedHashMap<>();
		
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", 20000);
		flower.put("day", 10);
		System.out.println(flower);
		
	}
	
}
