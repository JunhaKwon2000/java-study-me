package sec05.exam05;

public class PersonExample {
	
	public static void main(String[] args) {
		
		Person person = new Person("001020-3XXXXXX", "Junha Kwon");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
		// person.nation = "America"; // compile error - final field cannot be assigned
		// person.ssn = "111111-1111111"; // compile error - final field cannot be assigned
		person.name = "Nyaan";
		System.out.println(person.name);
		
	}

}
