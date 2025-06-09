package sec03.exam02;

import java.util.*;

public class ProductStorage {
	
	// Product 가 저장될 리스트
	private List<Product> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in); // 매개변수로 다양한 값들이 올 수 있음, 키보드 입력이니까 System.in
	private int counter; // 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	

	public void showMenu() {
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1. 등록  |  2. 목록  |  3. 종료");
			System.out.println("------------------------------");
			System.out.print("선택: ");
			String choice = sc.nextLine();
			switch (choice) {
				case "1": registerProduct(); break;
				case "2": showProducts(); break;
				case "3": System.out.println("프로그램을 종료합니다."); return;
				default: System.out.println("잘못된 번호."); 
			}
		}
	}
	
	public void registerProduct() {
		
		try {
			System.out.print("상품명을 입력하세요: ");
			String name = sc.nextLine();
			System.out.print("가격을 입력하세요: ");
			int price = Integer.parseInt(sc.nextLine());
			System.out.print("재고를 입력하세요: ");
			int stock = Integer.parseInt(sc.nextLine());
			Product p = new Product();
			p.setName(name);
			p.setPrice(price);
			p.setStock(stock);
			counter++;
			p.setPno(counter);
			list.add(p);			
		} catch (Exception e) {
			System.out.println("등록 에러" + e.getMessage());
		}
		
	}
	
	public void showProducts() {
		for (Product p : list) {
			System.out.println("상품번호: " + p.getPno() + " | 상품명: " + p.getName() + " | 가격: " + p.getPrice() + "원 | 재고: " + p.getStock() + "개");
		}
	}
}	

