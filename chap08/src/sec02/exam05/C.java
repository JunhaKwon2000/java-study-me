package sec02.exam05;

// methodA() 와 methodB() 물려받기, 인터페이스는 인터페이스끼리만 상속 가능(Object 가 최고 조상이 아님!), 다중 상속 가능(구현부가 없기 때문에)
public interface C extends A, B {
	
	void methodC();

	// 상속으로 물려받은 추상메서드 methodA(), methodB() 까지 총 3개의 메서드를 갖고 있음
	
}
