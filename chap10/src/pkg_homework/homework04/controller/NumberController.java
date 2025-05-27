package pkg_homework.homework04.controller;

import pkg_homework.homework04.exception.NumRangeException;

public class NumberController {

	// constructor
	public NumberController() {}
	
	
	// method
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		if (num1 > 100 || num1 < 0 || num2 > 100 || num2 < 0) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
		
		if (num1 % num2 == 0) return true;
		else return false;
	}
	
}
