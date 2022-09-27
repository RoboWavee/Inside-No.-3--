package lt.lhu.unit03cycles.main;
/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task08 {

	public static void main(String[] args) {
		
		double a = 15;
		double b = 89;
		double h = 0.6;
		double c = 0.1;
		double y = 0;
		
		for (double x = a; x <= b; x += h) {
			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}
		}
		
		System.out.println(y);

	}

}
