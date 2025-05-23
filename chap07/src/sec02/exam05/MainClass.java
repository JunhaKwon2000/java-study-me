package sec02.exam05;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Child(); // 자동 타입 변환
		
		p.field1 = "data1";
		p.method1();
		p.method2();
		
		// Child 에만 있는 field2 와 method3() 에는 접근이 불가능함
		// 캐스팅을 통해 추가로 서브 클래스의 필드와 메서드를 해금 가능
		
		Child child = (Child) p; // Child 로 캐스팅
		child.field2 = "data2";
		child.method3();
		
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		
	}
	
}
