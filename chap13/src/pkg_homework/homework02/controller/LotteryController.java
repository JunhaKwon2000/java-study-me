package pkg_homework.homework02.controller;

import java.util.*;
import pkg_homework.homework02.model.vo.Lottery;

public class LotteryController {
	
	// field
	private Set<Lottery> lottery = new HashSet<>();
	
	private Set<Lottery> win = new HashSet<>();
	
	// method
	public boolean insertObject(Lottery l) {
		int check = lottery.size();
		lottery.add(l);
		if (lottery.size() > check) return true;
		else return false;
	}
	
	public boolean deleteObject(Lottery l) {
		int check = lottery.size();
		lottery.remove(l);
		if (lottery.size() < check) {
			if (!win.isEmpty()) win.remove(l);
			return true;
		}
		else return false;
	}
	
	public Set<Lottery> searchObject(){
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		if (lottery.size() >= 4 && win.size() == 0) {
			List<Lottery> temp = new ArrayList<>(lottery);
			Set<Integer> random = new HashSet<>();
			while(true) {
				int i = (int)(Math.random() * temp.size());
				random.add(i);
				if (random.size() == 4) break;
			}
			for (int idx : random) {
				win.add(temp.get(idx));
			}
			return win;
		}
		else if (lottery.size() >= 4 && win.size() >= 1 && win.size() < 4) {
			List<Lottery> temp = new ArrayList<>(lottery);
			List<Lottery> temp2 = new ArrayList<>(win);
			Set<Integer> random = new HashSet<>();
			int check = 4 - win.size();
			while(true) {
				int i = (int)(Math.random() * temp.size());
				if (temp2.indexOf(temp.get(i)) != -1) continue;
				random.add(i);
				if (random.size() == check) break;
			}
			for (int idx : random) {
				win.add(temp.get(idx));
			}
			return win;
		}
		else if (win.size() == 4) return win;
		else return null;
	}
	
	public Set<Lottery> sortedWinObject(){
		List<Lottery> temp = new ArrayList<>(win);
		Collections.sort(temp);
		Set<Lottery> result = new LinkedHashSet<>(temp);
		return result;
	}
	
	public boolean searchWinner(Lottery l) {
		if (win.contains(l)) return true;
		else return false;
	}

}
