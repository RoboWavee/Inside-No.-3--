package lt.lhu.unit03cycles.main;
/*
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */

public class Task14 {

	public static void main(String[] args) {
		
		int n = 8;
		double i = 1;
		
		double sum = 0;
		
		while (i <= n) {
			sum = (double)(sum + (1/i));
			i++;
		}
		
		System.out.println(sum);
	}

}