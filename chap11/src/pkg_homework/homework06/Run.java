package pkg_homework.homework06;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		
		System.out.print("단어를 입력하세요: ");
		String userInput = sc.nextLine();
		
		if (sentence.contains(userInput)) {
			try {
				String nextWord = sentence.substring(sentence.indexOf(userInput) + userInput.length() + 1).split(" ")[0];
				System.out.println(userInput + " 다음 단어: " + nextWord);
			} catch (Exception e) {
				System.out.println("마지막 단어입니다.");
			}
		}
		else System.out.println("존재하지 않는 단어입니다.");
		
		sc.close();
		
	}

}
