package lt.lhu.unit03br.main;

/*
 * Определить, делителем каких чисел а, b, с является число k.
 */

public class Task20 {

	public static void main(String[] args) {
		
		int a, b, c;
		a = 18;
		b = 36;
		c = 25;
		
		int k = -2;
		
		if (a % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + a);
		}
		
		if (b % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + b);
		}
		
		if (c % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + c);
		}
		
	}

}
