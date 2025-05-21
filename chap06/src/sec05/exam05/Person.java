package sec05.exam05;

public class Person {
	
	// field
	final String nation = "Korea"; // final field - initialize when declared
	final String ssn; // final field - initialize when constructor is called
	String name;
	
	// constructor
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		// this.nation = "America"; // compile error - final field cannot be assigned
	}
	
}
