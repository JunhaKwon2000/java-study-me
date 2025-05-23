package sec03.exam04;

public class InformalEmployee extends Employee {
	
	// field
	private int primaryPay;

	// constructor
	public InformalEmployee(String name, String dept, int primaryPay) {
		super(name, dept, "비정규직");
		this.primaryPay = primaryPay;
	}
	
	// method
	@Override
	public int getPay() {
		return primaryPay;
	}
	
	@Override
	public String getInfo() {
		return getType() + ", " + getName() + ", " + getDept() + ", " + primaryPay;
	}

	

}
