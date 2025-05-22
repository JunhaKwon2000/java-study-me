package sec01.exam02;

public class Student extends People {

	
	public int studentNo;
	
	
	// if no constructors, compiler automatically adds default constructor
	// public Student() { super() } // compile error - no default constructor at super class

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // it is safe to leave the super class filed to the super class constructor
		this.studentNo = studentNo; // my field
		System.out.println("Sub class created.");
	}

	
}
