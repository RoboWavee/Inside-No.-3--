package lt.lhu.unit03cycles.main;
/*
 * Найти сумму квадратов первых ста чисел
 */

public class Task09 {

	public static void main(String[] args) {
		
		double x = 1;
		double sum = 1;
		
		while (x <= 100) {
			sum = sum + Math.pow(x, 2);
			x++;			
		}
		
		System.out.println("Сумма квадратов первых ста чисел" + sum);
		

	}

}
