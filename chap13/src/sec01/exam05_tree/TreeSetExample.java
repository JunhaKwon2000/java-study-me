package sec01.exam05_tree;

import java.util.*;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		// TreeSet
		// 데이터를 오름차순으로 자동 정렬
		// 저장한 순서 그대로는 보장하지 않음
		// "정렬된 순서를 보장함"
		Set<String> set = new HashSet<>();
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("동");
		linkedSet.add("서");
		linkedSet.add("남");
		linkedSet.add("북");
		System.out.println(linkedSet);
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("동");
		treeSet.add("서");
		treeSet.add("남");
		treeSet.add("북");
		System.out.println(treeSet);
		
		// 내림차순
		Set<String> treeSetReverse = new TreeSet<String>(Collections.reverseOrder());
		treeSetReverse.add("동");
		treeSetReverse.add("서");
		treeSetReverse.add("남");
		treeSetReverse.add("북");
		System.out.println(treeSetReverse);
		
	}

}
