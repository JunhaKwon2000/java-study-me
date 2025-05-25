package pkg_homework.homework02.controller;

import pkg_homework.homework02.model.vo.GreenTea;

public class GreenTeaController {
	
	private GreenTea gt = new GreenTea();
	
	public String bakeGreenTea(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		return gt.toString();
	}

	public GreenTea getGt() {
		return gt;
	}

	public void setGt(GreenTea gt) {
		this.gt = gt;
	}


}
