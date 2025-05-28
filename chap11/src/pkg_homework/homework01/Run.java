package pkg_homework.homework01;

public class Run {
	
	public static void main(String[] args) {
		
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] initialSplitArray = str.split("\n");
		Person[] personArray = new Person[initialSplitArray.length];
		
		for (int i = 0; i < initialSplitArray.length; i++) {
			String[] splitArray = initialSplitArray[i].split(",");
			personArray[i] = new Person(splitArray[0], Integer.parseInt(splitArray[1]), splitArray[2], splitArray[3].charAt(0));
			System.out.println(personArray[i]);
			}
		}
		
	}

