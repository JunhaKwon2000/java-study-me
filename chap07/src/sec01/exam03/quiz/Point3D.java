package sec01.exam03.quiz;

public class Point3D extends Point {
	
	protected int z;

	public Point3D(int x, int y, int z) {
		super(x, y); // differs by number/type of parameters(constructor overload)
		this.z = z;
	}

	@Override
	public void location() {
		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
	}
	
	
}
