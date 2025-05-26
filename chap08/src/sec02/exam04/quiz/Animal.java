package sec02.exam04.quiz;

public abstract class Animal {
	
	// field 
	private String kind;
	private int leg;
	
	// constructor
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}

	// method
	public String getKind() {
		return kind;
	}
	
	public int getLeg() {
		return leg;
	}
	
	public abstract void eat();
	
	public abstract void sound();

}
