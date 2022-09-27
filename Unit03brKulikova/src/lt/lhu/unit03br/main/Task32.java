package lt.lhu.unit03br.main;

/*
 * Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них
положительной
 */

public class Task32 {

	public static void main(String[] args) {
		
		double a, b, c;
		a = 7;
		b = -99;
		c = 2.8;
		
		double sum1, sum2, sum3;
		sum1 = a + b;
		sum2 = b + c;
		sum3 = a + c;
		
		if ((sum1 > 0) || (sum2 > 0) || (sum3 > 0)) {
			System.out.println("Есть положительная сумма +");
		} else {
			System.out.println("Все суммы отрицательные -");
		}
		
		
	}

}
