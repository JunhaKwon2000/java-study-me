package sec01.exam06.quiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Quiz1 {
	
// 		Quiz
//		FileInputStream을 사용하여 
//		애국가1.dat 파일을 읽어와서 콘솔에 표준 출력하세요.
			
//		[출력]
//		동해물과 백두산이 마르고 닳도록 하느님이 보우하사
//		우리나라 만세 무궁화 삼천리 화려강산
//		대한사람 대한으로 길이 보전하세
//		남산위에 저 소나무 철갑을 두른듯
//		바람서리 불변함은 우리기상 일세
//		무궁화 삼천리 화려강산 
//		대한사람 대한으로 길이보전하세
			
//		힌트: FileInputStream은 바이트 기반 스트림이므로 
//		바이트 배열 단위로 읽어와서 저장하고 이를 문자열로 변환
	
	public static void main(String[] args) {
		
		// 바이트 기반 스트립은 바이트 간위로 데이터를 읽음 -> 문자의 "코드값"만 처
		
		byte[] buffer = new byte[1000];
		String result = "";
		
		try(InputStream is = new FileInputStream("C:/Windows/Temp/애국가1.dat")) {
			int byteRead = is.read(buffer);
			result = new String(buffer, 0, byteRead, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
		
		// 이렇게 바이트를 직접 읽고 수동으로 디코딩(비추천)
		// 가능은 하지만 인코딩 경계 문제(멀티바이트 문자 잘림 등)가 있어서 복잡하고 오류 위험이 큼
		// 애를 들어 1000개씩 안가져오고 한 10개씩 가져오면 3 > 3 > 3 > 1(짤림) 이렇게 한글의 경우 짤림
		// => 문자 기반 스트림 사용
		
	}

}
