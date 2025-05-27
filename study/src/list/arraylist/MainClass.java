package list.arraylist;

import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		
		// List: 저장용량이 자동으로 증가, 객체를 저장할 때 "자동"으로 인덱스가 부여됨, 추가 & 삭제 & 검색 등을 위한 메서드가 마련되어 있음
		// List 도 Array 랑 동일하게 실제 객체를 저장하는 것이 아닌 객체가 저장된 메모리의 주소를 참조함
		
		// List - ArrayList: List 의 대표적인 구현 클래스, 배열과 유사함
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1); // 0번에 1을 넣어주세요
		list.add(2); // 1번에 2를 넣어주세요
		list.add(3); // 2번에 3을 넣어주세요
		list.add(2, 4); // 2번에 4를 넣어주세요 -> 기존의 2번 인덱스에 있었던 값인 3은 한칸 밀려서 3번 인덱스가 됨
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 인덱스의 값 : " + list.get(i));
		}
		
		
		
	}

}
