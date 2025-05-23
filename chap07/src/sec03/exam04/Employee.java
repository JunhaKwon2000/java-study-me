package sec03.exam04;

public abstract class Employee {
	
	// field
	private String type;
	private String name;
	private String dept;
	
	// constructor
	public Employee(String name, String dept, String type) {
		this.name = name;
		this.dept = dept;
		this.type = type;
	}	
	
	// method
	public abstract int getPay();

	public abstract String getInfo();
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}

}
