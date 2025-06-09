package sec03.exam03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// File Class: 파일 및 폴더 생성과 삭제, 정보 얻기(이름, 경로, 크기, 최종 수정일 등) 등등 파일과 관련된 작업을 수행할 수 있도록 도와주는 클래스
public class FileExample {

	public static void main(String[] args) {
		// 경로 구분자
		// 1. Window: \(\\) or /(호환성 및 편의성을 위해 제공)
		// 2. UNIX/LINUX/macOS: /
		// Java 는 별개로 File, Path 등 경로 관련 클래스 내부적으로 플랫폼별 경로 구분자 처리를 자동으로 해줌
		
		// 파일 객체 생성(생성자에 상대 경로 or 절대 경로 작성)
		// 상대경로의 기준 = 프로젝트의 루트(여기서는 chap14) 기준
		// 파일 객체를 생성했다고 해서 파일이나 폴더가 생성되는 것은 아님
		// 문자열 경로에 실제 파일이나 폴더가 없더라고 예외가 발생하지 않음
		File dir = new File("C:/Windows/Temp/images"); // 매개변수로 String 타입의 pathName 필요
		File file1 = new File("C:/Windows/Temp/file1.txt");
		File file2 = new File("C:/Windows/Temp/file2.txt");
		File file3 = new File("C:\\Windows\\Temp\\file3.txt"); // \는 보통 escape 문자를 나타내기 때문에 \\ 로 연결
		
		// 해당 경로에 실제 파일이나 폴더가 있는지 확인
		// 존재하지 않으면 생성(폴더 및 파일)
		if (!dir.exists()) dir.mkdirs();
		try {
			if (!file1.exists()) file1.createNewFile();
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
			e.printStackTrace();
		}
		try {
			if (!file2.exists()) file2.createNewFile();
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
			e.printStackTrace();
		}
		try {
			if (!file3.exists()) file3.createNewFile();
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
			e.printStackTrace();
		}
		
		// 폴더 생성 2가지 방법 차이점
		// mkdir() vs mkdirs() - 주로 사용하는 것은 mkdirs()
		File dirTest = new File("C:/Windows/Temp/test/videos");
		// if (!dirTest.exists()) dirTest.mkdir(); // test 라는 폴더가 없기 때문에 videos 를 만들 수가 없음, mkdir 은 경로의 마지막 폴더만 만들기 때문(상위 폴더들은 다 존재해야함)
		if (!dirTest.exists()) dirTest.mkdirs(); // 경로상에 없는 모든 폴더를 생성(여기서는 test 와 그 밑에 videos)
		
		// 폴더 삭제
		if (dirTest.delete()) System.out.println("videos 폴더 삭제 완료."); // 먼저 videos 폴더 삭제
		dirTest = new File("C:/Windows/Temp/test");
		if (dirTest.delete()) System.out.println("test 폴더 삭제 완료."); // 삭제 완됨 -> 폴더가 비어있어야만 삭제 가능, 파일이나 하위 폴더가 존재한다면 먼저 꼭 삭제해줘야함
		
		// 파일 삭제
		if (file3.delete()) System.out.println("file3.txt 파일 삭제 완료.");
		
		// 파일 및 폴더 유형 확인
		// 파일인지 폴더인지 여부를 true/false 로 return
		System.out.println("폴더? " + dir.isDirectory());
		System.out.println("파일? " + dir.isFile());
		System.out.println("폴더? " + file1.isDirectory());
		System.out.println("파일? " + file1.isFile());
		
		// 상위(부모) 폴더 확인
		// 파일이나 폴더가 속한 상위(부모) 폴더의 경로를 문자열로 리턴함
		System.out.println(dir.getParent()); // images 폴더의 상위 폴더
		// 상위(부모) 폴더를 File 객체로 만든 후 return
		File parentDir = dir.getParentFile();
		
		// 파일 및 폴더의 전체 경로 확인
		System.out.println(dir.getPath());
		System.out.println(file1.getPath());
		System.out.println(dir.getAbsolutePath());
		
		System.out.println();
		
		// Temp 폴더 정보 출력하기
		File temp = new File("C:/Windows/Temp");
		if (temp.exists() && temp.isDirectory()) {
			// Temp 폴더에있는 파일 및 하위 폴더를 File[] 로 return 받음
			File[] files = temp.listFiles();
			
			System.out.println("시간\t\t\t형태\t\t크기\t이름");
			System.out.println("---------------------------------------------------------");
			
			// 날짜 포맷 지정
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			
			// java.time API 사용 시
//			DateTimeFormatter dmf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm");
			
			// 반복문을 사용하여 모든 파일과 폴더 확인 가능
			for (File file : files) {
				// 파일의 마지막 수정 날짜 확인
				// 마지막 수정 시간을 밀리초 단위로 반환
				// 날짜 형식으로 바꾸기 위해 SimpleDateFormat 활용
				System.out.print(sdf.format(new Date(file.lastModified())));
				// java.time API 이용 시(권장)
				// long(밀리초) -> Instant -> ZonedDateTime(or LocalDateTime)
//				ZonedDateTime dateTime = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()); // 한국이니까 Asia/Seoul(UTC+9)
//				System.out.println(dmf.format(dateTime));
				
				// 폴더인지 검사
				if (file.isDirectory()) {
					// 폴더 이름만 출력
					System.out.print("\t<DIR>\t\t\t" + file.getName());
				} else {
					// 파일 크기 + 파일 이름 출력(length() 로 나오는 크기의 단위 = byte)
					// 필요에 따라 단위를 환산하여 사용(1kb = 1024 Byte, 1mB = 1024 kB...)
					System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
				}
				System.out.println();
			}
		} else System.out.println("폴더가 존재하지 않거나, 폴더가 아닙니다.");
	}
	
}
