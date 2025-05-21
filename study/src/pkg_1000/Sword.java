package pkg_1000;

public class Sword {
	// 필드
	String name;
	double damage;
	double weight;
	
	
	// 생성자
	Sword() {}
	
	Sword(double damage, double weight) {
		this.damage = damage;
		this.weight = weight;
	}
	
	Sword(String name, double damage, double weight) {
		this.name = name;
		this.damage = damage;
		this.weight = weight;
	}

	// 메소드
	void slash() {
		System.out.println("벤다.");
	}
	

}
