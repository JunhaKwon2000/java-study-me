package pkg_homework.homework03.controller;

import java.util.*;
import pkg_homework.homework03.model.vo.Member;

public class MemberController {
	
	Map<String, Member> map = new HashMap<>();
	
	
	public boolean joinMember(String id, Member m) {
		if (map.containsKey(id)) return false;
		else {
			map.put(id, m);
			return true;
		}
	}
	
	public String logIn(String id, String password) {
		if (map.containsKey(id)) {
			if (map.get(id).getPassword().equals(password)) return map.get(id).getName();
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id)) {
			if (map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String,String> sameName(String name) {
		Set<String> keys = map.keySet();
		TreeMap<String, String> result = new TreeMap<>();
		for (String key : keys) {
			Member m = map.get(key);
			if (m.getName().equals(name)) result.put(key, name);
		}
		return result;
	}

}
