package pkg_homework.homework03.controller;

import pkg_homework.homework03.exception.CharCheckException;

public class CharacterController {
	
	// constructor
	public CharacterController() {}
	
	
	// method
	public int countAlpha(String s) throws CharCheckException {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			if (currentChar == ' ') throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			
			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) cnt++;
		}
		return cnt;
	}

}
