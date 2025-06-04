package pkg_homework.homework03.view;

import java.util.*;
import pkg_homework.homework03.controller.MemberController;
import pkg_homework.homework03.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		// 1. 종료 전까지 메뉴 화면 반복 실행
		// 2. 각 메뉴 번호를 입력하면 해당 메소드로 이동
		// 3. 잘못 입력하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요." 출력
		// 출력 예시)
		// ===== (주)가남에 오신것을 환영합니다. =====
		// 원하시는 메뉴의 번호를 입력하세요.
		// 1. 회원가입 -> joinMember() 실행
		// 2. 로그인 -> logIn() 실행 후 memberMenu() 실행
		// 3. 같은 이름 회원 찾기 -> sameName() 실행
		// 9. 종료 -> "프로그램을 종료합니다." 출력
		// 메뉴 번호 입력 : 
		
		while(true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: joinMember(); break;
			case 2: logIn(); memberMenu(); break;
			case 3: sameName(); break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void memberMenu() {
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1: changePassword(); break;
				case 2: changeName(); break;
				case 3: System.out.println("로그아웃 되었습니다."); return;
				default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void joinMember() {
		System.out.println("=== 1. 회원가입 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			boolean check = mc.joinMember(id, new Member(pw, name));
			if (check) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
		
	}
	
	public void logIn() {
		System.out.println("=== 2. 로그인 ===");
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			
			String check = mc.logIn(id, pw);
			if (check == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			} else {
				System.out.println(check + "님, 환영합니다!");
				break;
			}
		}
	}
	
	public void changePassword() {
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String pwNow = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String pwNext = sc.nextLine();
			
			boolean check = mc.changePassword(id, pwNow, pwNext);
			if (check) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeName() {
		System.out.println("=== 2. 이름 바꾸기 ===");
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			
			String name = mc.logIn(id, pw);
			if (name == null) {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			} else {
				System.out.println("현재 설정된 이름 : " + name);
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공했습니다.");
				break;
			}
			
		}
	}
	
	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름 : ");
		String search = sc.nextLine();
		TreeMap<String, String> result = mc.sameName(search);
		Set<Map.Entry<String, String>> entries = result.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}
	}
}
