package lt.lhu.unit03br.main;

/*
 * Написать программу нахождения суммы большего и меньшего из трех чисел
 */

public class Task26 {

	public static void main(String[] args) {
		
		double a, b, c;
		a = 80;
		b = 20;
		c = 8.999;
		
		double min, max, sum;
		min = 0;
		max = 0;
		sum = 0;
		
		if (a < b && a < c) {
			min = a;
		}
		
		if (b < a && b < c) {
			min = b;
		}
		if (c < a && c < b) {
			min = c;
		}
		if (a > b && a > c) {
			max = a;
		}
		
		if (b > a && b > c) {
			max = b;
		}
		if (c > a && c > b) {
			max = c;
		}
		
		sum = min + max;
		
		System.out.println(sum);

	}

}
