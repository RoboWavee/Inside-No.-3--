package lt.lhu.unit03br.main;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task27 {

	public static void main(String[] args) {
		
		double a, b, c, d;
		a = 85.6;
		b = 25.12;
		c = 5.88;
		d = 5.89;
		
		double min1, min2, max;
		min1 = 0;
		min2 = 0;
		max = 0;
		
		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		
		max = min1 + min2;
		
		System.out.println(max);
	}

}
