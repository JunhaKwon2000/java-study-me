package pkg_homework.homework02;

public class Practice {
	
	public static String takeState(String s) {
		
		String[] arr = s.split(" ");
		
		for (String words : arr) {
			if (words.indexOf("구") == words.length() - 1) return words;
		}
		
		return null;
	}
	
}
