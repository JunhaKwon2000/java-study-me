package sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		
		
		FieldInitValue test = new FieldInitValue();
		
		System.out.println("byte : " + test.byteInit);
		System.out.println("short : " + test.shortInit);
		System.out.println("int : " + test.intInit);
		System.out.println("long : " + test.longInit);
		
		System.out.println();
		
		System.out.println("float : " + test.floatInit);
		System.out.println("double : " + test.doubleInit);
		
		System.out.println();
		
		System.out.println("boolean : " + test.boolInit);
		System.out.println("char : " + test.charInit); // 빈 공백(0)
		
		System.out.println();
		
		System.out.println("int array : " + test.arrIntInit);
		System.out.println("reference : " + test.referenceInit);


	}

}
