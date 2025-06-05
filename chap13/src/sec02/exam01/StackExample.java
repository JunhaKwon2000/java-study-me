package sec02.exam01;

import java.util.Stack;


// 동전 케이스를 Stack 클래스로 구현한 예제
// 동전 케이스는 위에만 열려있는 스택 구조를 가짐
// 먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에
// Stack 에서 동전을 빼면 마지막에 넣은 동전이 먼저 나오게 됨
// LIFO(Last In First Out)
public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<Coin> coinFrame = new Stack<>();
		
		coinFrame.push(new Coin(100));
		coinFrame.push(new Coin(500));
		coinFrame.push(new Coin(50));
		coinFrame.push(new Coin(10));
		
		while (true) {
			Coin coin = coinFrame.pop();
			System.out.println("맨 위의 코인: " + coin.getValue());
			if (coinFrame.isEmpty()) break;
		}
		
	}

}
