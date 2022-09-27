package lt.lhu.unit03cycles.main;
/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task10 {

	public static void main(String[] args) {

		long x = 1;
		long sum = 1;
		
		while (x <= 200) {
			sum = (long)(sum * Math.pow(x, 2));
			x++;			
		}
		
		System.out.println(sum);
		

	}

}
