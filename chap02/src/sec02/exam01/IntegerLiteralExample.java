package sec02.exam01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011; // 4btye(2진수 - 임베디드)
		int var2 = 013; // 4btye(8진수)
		int var3 = 11; // 4btye(10진수 - 표준)
		int var4 = 0xB3; // 4btye(16진수 - RGB 색상)
		System.out.println(var1 + " " + var2 + " " + var3 + " " + var4);

	}

}
