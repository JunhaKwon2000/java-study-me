package pkg_homework.homework02.controller;

import pkg_homework.homework02.model.vo.Chocolate;

public class ChocolateController {
	
	private Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
		c.setCherry(cherry);
		c.setChip(chip);
		return c.toString();
	}

	public Chocolate getC() {
		return c;
	}

	public void setC(Chocolate c) {
		this.c = c;
	}

}
