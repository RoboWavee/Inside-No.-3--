package lt.lhu.unit03br.main;
/*
 Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к
началу координат


 */


public class Task13 {

	public static void main(String[] args) {
		
		double x1, y1;
		x1 = 15; 
		y1 = -5;
		
		double x2, y2;
		x2 = -18;
		y2 = -2;
		
		double A, B;
		A = Math.sqrt(x1 * x1 + y1 * y1); //По формуле нахождения гипотенузы прямоугольного треугольника
		B = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (A == B) {
			System.out.println("Две точки находятся на одинаковом расстоянии от начала координат");
			
		}else if (A < B) {
			System.out.println("Точка A находится ближе к началу координат");
		} else {
			System.out.println("Точка B находится ближе к началу координат");
		}
		

	}

}
