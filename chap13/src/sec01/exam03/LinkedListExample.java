package sec01.exam03;

import java.util.*;

// LinkedList -> 특수한 상황 외에는 사용 X, ArrayList 를 사용
public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) list1.add(0, i + "");
		end = System.nanoTime();
		System.out.println("ArrayList : " + (end - start) + "ns");
		
		start = System.nanoTime();
		for (int i = 0; i < 10000; i++) list2.add(0, i + "");
		end = System.nanoTime();
		System.out.println("LinkedList: " + (end - start) + "ns");
		
	}
	
}
