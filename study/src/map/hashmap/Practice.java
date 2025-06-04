package map.hashmap;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> eSet = map.entrySet();
		
		for (Map.Entry<String, Integer> e : eSet) {
			totalScore += e.getValue();
			if (e.getValue() >= maxScore) {
				maxScore = e.getValue();
				name = e.getKey();
			}
		}
		
		totalScore = totalScore / map.size();
		System.out.println(totalScore);
		System.out.println(name);
		System.out.println(maxScore);
		
	}

}
