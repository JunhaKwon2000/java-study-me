package sec01.exam07.pack02;

import sec01.exam07.pack01.A;

public class D extends A {
	
	// protected modifier can be used through inheritance
	// but creating object directly(using new) is banned
	
//	public void method() {
//			
//			A a = new A(); // accessed
//			
//			a.field = "test"; // accessed
//				
//			a.method(); // accessed
//			
//			
//			
//		}
	
	
	public D() { 
		super(); 
		field = "test";
		method();
	}
	
	public void method() {
		field = "test2";
		super.method();
	}

}
