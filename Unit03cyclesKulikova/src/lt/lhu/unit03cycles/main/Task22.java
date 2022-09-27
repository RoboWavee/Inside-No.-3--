package lt.lhu.unit03cycles.main;

public class Task22 {

	public static void main(String[] args) {

		double a = -3;
		double b = 15;
		double h = 1;
		
		double y;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for (double x = a; x <= b; x = x + h) {
			y = Math.pow((Math.sin(x)), 2);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");

	}

}
