package sec01.exam04;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		HashMap<Member, String> hashMap = new HashMap<Member, String>();
		
		hashMap.put(new Member("fall"), "준하1");
		hashMap.put(new Member("winter"), "준하2");
		hashMap.put(new Member("winter"), "준하3");
		

		System.out.println(hashMap.get(new Member("fall")));
		System.out.println(hashMap.get(new Member("winter"))); // 준하2는 없어짐
	}
	
}
