package sec01.exam04.quiz;

public class Student {
	
	// field
	private int studentNo;
	private String name;
	private String major;
	
	
	
	// constructor
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
	
	
	// method
	@Override
	public boolean equals(Object object) {
		if (object instanceof Student s) {
			if ((studentNo == s.studentNo) && (name.equals(s.name))) {
				return true;
			}	
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}

}
