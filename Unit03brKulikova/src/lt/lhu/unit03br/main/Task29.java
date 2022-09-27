package lt.lhu.unit03br.main;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */

public class Task29 {

	public static void main(String[] args) {

		double x1, x2, x3, y1, y2, y3;
		x1 = 3;
		y1 = 3;
		x2 = 2;
		y2 = 2;
		x3 = 1;
		y3 = 5;
		
		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки лежат на одной прямой");
			
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}

}
