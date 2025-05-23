package sec03.exam04;

public class FormalEmployee extends Employee {
	
	// field
	private int empNo;
	private int salary;
	
	// constructor
	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super(name, dept, "정규직");
		this.empNo = empNo;
		this.salary = salary;
	}	
	
	// method
	@Override
	public int getPay() {
		return salary / 12;
	}
	
	@Override
	public String getInfo() {
		return getType() + ", " + getName() + ", " + getDept() + ", " + empNo + ", " + salary;
	}


	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
