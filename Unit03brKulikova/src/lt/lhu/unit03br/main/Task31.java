package lt.lhu.unit03br.main;

/*
 Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.
 */

public class Task31 {

	public static void main(String[] args) {
		
		double a = 15, b = 7;
		double x = 4, y = 47, z = 44;
		
		if ((a > x) & (b > y)) {
			System.out.println("Пройдет +");
			} else if ((a > y) & (b > x)) {
			System.out.println("Пройдет +");
			} else if ((a > x) & (b > z)) {
			System.out.println("Пройдет +");
			} else if ((a > z) & (b > x)) {
			System.out.println("Пройдет +");
			} else if ((a > y) & (b > z)) {
			System.out.println("Пройдет +");
			} else if ((a > z) & (b > y)) {
			System.out.println("Пройдет +");
			} else {
			System.out.println("Не пройдет -");
			}

	}
}

