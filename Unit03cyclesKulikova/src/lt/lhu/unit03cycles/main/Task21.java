package lt.lhu.unit03cycles.main;
/*
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции:
 */

public class Task21 {
	
	public static void main(String[] args) {
		
		double a = -10;
		double b = 5.5;
		double h = 1.5;
		
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for (double x = a; x <= b; x = x + h) {
			y = x - Math.sin(x);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}

}
