package sec02.exam02;

public class MainClass {
	
	public static void main(String[] args) {
		
		// When you declare the type to be the super class, you can only use the methods defined in the super class
		
		Parent instance1 = new Child(); // Automatic type change
		
		instance1.method1(); // Parent's method1()
		instance1.method2(); // Child's overridden method2()
		// instance1.method3(); // compile error - method3() not defined in Parent class

		
		
		// think of the type of a reference variable as a controller
		// if you set it as the sub class type, you gain access to all methods
		// if you set it as the super class type, you only gain access to methods defined in super class
	}
	
}
