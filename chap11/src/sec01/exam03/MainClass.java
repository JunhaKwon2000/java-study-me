package sec01.exam03;

import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args) {
		
		// Map: key/value 쌍으로 저장하는 컬렉션
		// Key 객체를 식별킬로 사용해서 String 값을 저장하는 HashMap 객체 생성
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)" 로 "준하"를 저장함
		hashMap.put(new Key(1), "준하");
		
		// 식별키 "new Key(1)"로 "준하"를 읽어옴
		System.out.println(hashMap.get(new Key(1)));
		
		// equals 메서드를 재정의 햇음에도 동등 객체로 판단하지 않는다
		// 왜냐하면 로직 자체가 get 메서드를 호출할 때 hashCode() 를 먼저 비교하고(찾을 범위를 좁히기) 그 다음 equals() 로 진짜 값이 같은지 비교하기 때문
		// 따라서 hashCode 의 재정의도 필요한 거임
		
		// 정리: 그래서 HashMap 의 키로는 String 이 가장 많이 사용됨(왜냐하면 String 클래스에서 이미 equals 랑 hashCode 메서드가 모두 재정의되어있기 떄문입니다!)
		// 하지만 내가 만든 객체를 키로 쓴다면 hashCode 및 equals 메서드를 재정의하는 것이 필요함
		
		
		// 참고
		// hashCode() 가 재정의 된 대표적인 예
		String str1 = "김";
		String str2 = "김";
		String str3 = new String("김");
		String str4 = new String("김");
		// str1 과 str2 는 값이 같으니 어차피 똑같은 객체를 가르킴, str3 과 str4 는 다 다른 객체
		// 하지만 어떻게 만들던 해쉬코드는 모든 동일
		System.out.println(str1.hashCode() + " " + str2.hashCode() + " " + str3.hashCode() + " " + str4.hashCode());
		
		System.out.println();
		
		// 시스템이 구성한 값 그대로 출력하고 싶다면?
		System.out.println(System.identityHashCode(str1)); // 2와 같음
		System.out.println(System.identityHashCode(str2)); // 1와 같음
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
	
}
