package sec01.exam27;

public class MathExample {
	
	public static void main(String[] args) {
		
		// abs
		int v1 = Math.abs(-10); // 10
		double v2 = Math.abs(-3.14); // 3.14
		System.out.println(v1 + " " + v2);
		
		// ceil
		double v3 = Math.ceil(5.3); // 6
		double v4 = Math.ceil(-5.3); // -5
		System.out.println(v3 + " " + v4);
		
		// floor
		double v5 = Math.floor(5.3); // 5
		double v6 = Math.floor(-5.3); // -6
		System.out.println(v5 + " " + v6);
		
		// max
		int m1 = Math.max(1, 5); // 5
		double m2 = Math.max(-3.14, -2.98); // -2.98
		System.out.println(m1 + " " + m2);
		
		// min
		int m3 = Math.min(1, 5); // 1
		double m4 = Math.min(-3.14, -2.98); // -3.14
		System.out.println(m3 + " " + m4);
		
		// random
		double r = Math.random();
		System.out.println(r);
		
		// rint
		double v7 = Math.rint(5.3); // 5.0
		double v8 = Math.rint(5.5); // 6.0
		System.out.println(v7 + " " + v8);
		
		// round: return long
		long v9 = Math.round(5.3); // 5
		long v10 = Math.round(5.5); // 6
		System.out.println(v9 + " " + v10);
		
		// round(소수점 n번째 자리)
		double temp = 12.3456;
		double v11 = Math.round(temp * 100) / 100.0;
		System.out.println(v11);
	}

}
