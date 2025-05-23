package pkg_homework.homework01.model.vo;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salalry, String dept) {
		super(age, height, weight);
		this.salary = salalry;
		this.dept = dept;
		setName(name);
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	};
	
	
	
	
	
}
