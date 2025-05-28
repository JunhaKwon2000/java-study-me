package sec01.exam10;

public class ResourcePathExample {
	
	public static void main(String[] args) {
		
		Class<?> clazz = Car.class;
		
		
		// Class 객체는 해당 클래스 파일의 경로 정보를 가지고 있음
		// 이를 활용해 다른 리소스 파일의 경로를 얻을 수 잇음
		
		// 현재 클래스(Car 클래스 파일이 있는 위치)가 있는 위치에서 절대경로로 대상 파일의 절대경로를 찾아 리턴해줌
		String photo1path = clazz.getResource("photo1.jpg").getPath();  
		System.out.println(photo1path);
		
		
		// 찾을 파일이 없으면 NPE 발생
		String photo2path = clazz.getResource("images/photo2.jpg").getPath();  
		System.out.println(photo2path); 
	}

}
