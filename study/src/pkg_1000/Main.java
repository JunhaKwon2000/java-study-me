package pkg_1000;


public class Main {

	public static void main(String[] args) {
		
		
		Sword sw1 = new Sword();
		System.out.println(sw1.name);
		System.out.println(sw1.damage);
		System.out.println(sw1.weight);
		sw1.slash();
		
		Sword sw2 = new Sword("엑스칼리버", 50.4, 25.3);
		System.out.println(sw2.name);
		System.out.println(sw2.damage);
		System.out.println(sw2.weight);
		
		
		
	}

}
