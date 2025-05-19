package sec03.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean person1 = new Korean("권준하", "001020-3XXXXXX");
		System.out.println(person1.nation);
		System.out.println(person1.name);
		System.out.println(person1.ssn);
				
		System.out.println();
		
		Korean person2 = new Korean("김자바", "000510-4XXXXXX");
		System.out.println(person2.nation);
		System.out.println(person2.name);
		System.out.println(person2.ssn);
		
		
	}
}
