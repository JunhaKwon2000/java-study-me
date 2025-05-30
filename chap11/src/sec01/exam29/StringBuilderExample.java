package sec01.exam29;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		// StringBuilder -> String 을 변경 가능한 객체로
		// String 이어붙이기, 수정 등에 사용
		
		StringBuilder sb = new StringBuilder();
		
		
		// 문자열 끝에 값 추가
		sb.append("이어지는단어");
		System.out.println(sb);
		
		// 인덱스 위치에 값 추가
		sb.insert(4, "XOXO");
		System.out.println(sb);
		sb.insert(4, 33); // overloading -> 다른 타입을 넣어도 String 으로
		System.out.println(sb);
		
		// 인덱스 위치의 문자 변경
		sb.setCharAt(4, 'L');
		System.out.println(sb);
		
		// 시작 ~ 끝(끝 이전) 인덱스 위치의 문자 변경
		sb.replace(4, 6, "LOVE");
		System.out.println(sb);
		
		// 시작 ~ 끝(끝 이전) 인덱스 위치의 문자 삭제
		sb.delete(4, 8);
		System.out.println(sb);

		// 현재 길이 반환 -> return int
		System.out.println("총 문자수: " + sb.length());
		
		// 현재 문자열 내용을 반환 -> return String
		System.out.println("내용: " + sb.toString()); // override
		System.out.println("내용: " + sb);
		
		// 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		// 정리
		// 내부에서 문자열을 저장해서 조작
		// 변경이 있을 때마다 객체 생성 X
		// 문자열을 많이 변경할 경우 String 보다 StringBuilder 를 쓰는 것이 성능상 더 좋음
		
	}
	
}
