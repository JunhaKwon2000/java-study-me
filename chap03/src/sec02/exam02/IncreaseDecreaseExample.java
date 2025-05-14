package sec02.exam02;

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		x++;
		System.out.println(x); // x = x + 1 -> x = 11
		
		++x;
		System.out.println(x); // x = x + 1 -> x = 11
		
		y--;
		System.out.println(y); 
		
		--y;
		System.out.println(y); 
		
		System.out.println();
		
		 
		int z;
		
		x = 10;
		z = x++; // z = 10, x = 11
		System.out.println(z + " " + x);
		
		x = 10;
		z = ++x; // z = x = 11 
		System.out.println(z + " " + x);
		
		x = 10;
		y = 10;
		z = ++x + y++; // z = 21, x = y = 11
		System.out.println(z + " " + x + " " + y);
		
		// 가독성 교려하여 명확하게 작성하는 것도 좋은 방법
		x = 10;
		y = 10;
		x++;
		z = x + y;
		y++;
		System.out.println(z + " " + x + " " + y);

	}

}