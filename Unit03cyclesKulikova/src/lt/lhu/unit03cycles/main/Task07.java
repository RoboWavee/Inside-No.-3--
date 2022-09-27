package lt.lhu.unit03cycles.main;
/*
 * Вычислить значения функции на отрезке [а,b] c шагом h
 */
public class Task07 {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 8.5;
		double h = 1.5;
		double y = 0;
		
		for (double x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = x * (-1);
			}
		}
		
		System.out.println(y);
		

	}

}
