package pkg_homework.homework02;

public class Run {
	
	public static void main(String[] args) {
		
		String[] arr = new String[4];
		
		arr[0] = "서울특별시 금천구 구로디지털2로 95";
		arr[1] = "서울특별시 서대문구 연희로 248";
		arr[2] = "울산광역시 남구 돋질로 233";
		arr[3] = "경상북도 구미시 송정대로 55";
		
		for (String items : arr) {
			System.out.println(Practice.takeState(items));
			System.out.println(takeState(items));
		}
		
	}
	
	
	public static String takeState(String s) {
		String[] arr = s.split(" ");
		
		for (String words : arr) {
			if(words.endsWith("구")) return words;
		}
		
		return null;
	}

}
