package sec01.exam08;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String pw = sc.nextLine();
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인.");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("아이디를 찾을 수 없습니다.");
			}
		}
		
		map.compute("spring", (k, v) -> (v.equals("12") ? v.concat("34567") : v.concat("12")));
		System.out.println(map);
		
		sc.close();
		
	}
	
}
