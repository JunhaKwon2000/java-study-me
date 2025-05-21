package sec06.exam05.package02;

import sec06.exam05.package01.A;

public class C {
	
	public C() {
		// default field and method can't be accessed in different package
		A a = new A();
		
		a.field1 = 1;
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1();
		// a.method2();
		// a.method3();
		
	}
	
	public void method() {
		// private field and method can't be accessed in different class
		A a = new A();
		
		a.field1 = 1;
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1();
		// a.method2();
		// a.method3();
	}

}
