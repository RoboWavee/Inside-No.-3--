package lt.lhu.unit03br.main;

/*
 Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую
степень — отрицательные 
 
 */

public class Task12 {

	public static void main(String[] args) {
		
		double a, b, c;
		a = -5;
		b = 0;
		c = 0.015;
		
		double ax, bx, cx;
		ax = 0;
		bx = 0;
		cx = 0;
		
		
		if (a >= 0) {
			ax = Math.pow(a, 2);
			System.out.println("A в степени 2 = " + ax);
		} else {
			ax = Math.pow(a, 4);
			System.out.println("A в степени 4 = " + ax);
		}
		
		if (b >= 0) {
			bx = Math.pow(b, 2);
			System.out.println("B в степени 2 = " + bx);
		} else {
			bx = Math.pow(b, 4);
			System.out.println("B в степени 4 = " + bx);
		}
		
		if (c >= 0) {
			cx = Math.pow(c, 2);
			System.out.println("C в степени 2 = " + cx);
		} else {
			cx = Math.pow(c, 4);
			System.out.println("C в степени 4 = " + cx);
		}
		
		
	}

}
