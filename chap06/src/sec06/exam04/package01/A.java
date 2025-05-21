package sec06.exam04.package01;

public class A {
	
	// all constructors can be accessed in the same class(public, default, private)
	A a1 = new A(true);  
	A a2 = new A(1);  
	A a3 = new A("test");  

	// constructor overload
	public A(boolean b) {}
	A(int b) {}	
	private A(String s) {}
	
}
