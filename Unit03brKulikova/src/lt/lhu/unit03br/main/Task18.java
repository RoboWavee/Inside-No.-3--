package lt.lhu.unit03br.main;
/*
 * Подсчитать количество отрицательных среди чисел а, b, с.
 */

public class Task18 {

	public static void main(String[] args) {
		
		int a, b, c;
		a = -6;
		b = -8;
		c = -72;
		
		int num;
		num = 0;
		
		if (a < 0) {
			num++;
		}
		
		if (b < 0) {
			num++;
		}
		
		if (c < 0) {
			num++;
		}
		
		System.out.println("Количество отрицательных чисел: " + num);

	}

}
