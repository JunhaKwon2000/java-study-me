package sec01.exam22_split_join;

// 문자열을 잘라서 배열로 만들고 다시 문장열로 되돌리기: split, join
public class StringSplitJoinExample {

	public static void main(String[] args) {
		
		// split()
		// 문자열을 배열로 나누기
		// 문자열을 특정 구분자로 나눠서 문자열 배열로 변환
		// 구분자를 기준으로 각 요소를 개별적으로 처리하고 싶을 때
		String str = "봄-여름-가을-겨울";
		String[] strSplit = str.split("-"); // 크기는 알아서 할당
		System.out.println(strSplit.length);
		for (String s : strSplit) System.out.println(s);
		
		// join()
		// 문자열 배열을 하나의 문자열로 결합
		// 배열이나 리스트 등의 문자열 요소를 하나의 문자열로 합칠 때 사용
		// 각 요소 사이에 지정한 구분자를 넣음
		String strJoin = String.join(" 다음에 ", strSplit);
		System.out.println(strJoin);
	}
	
}
