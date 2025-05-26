package sec02.exam05;

public class MainClass {

	public static void main(String[] args) {
		
		ImplementationC c = new ImplementationC();
		
		A a = c; // A 타입으로 선언하면 A 에 정의된 methodA() 만 사용 가능
		a.methodA();
		
		System.out.println();
		
		B b = c; // B 타입으로 선언하면 B 에 정의된 methodB() 만 사용 가능
		b.methodB();
		
		System.out.println();
		
		// C 타입으로 선언하면 C 에 정의된 methodA(), methodB(), methodC() 사용 가능
		c.methodA();
		c.methodB();
		c.methodC();
		
	}
	
}
