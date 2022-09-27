package lt.lhu.unit03br.main;

/*
 Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */

public class Task08 {

	public static void main(String[] args) {
		
		double a,b;
		a = -4;
		b = 3;
		
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		
		if (a2 > b2) {
			System.out.println("Из чисел " + a + " и " + b + "наименьший квадрат = " + b2);
		} else {
			System.out.println("Из чисел " + a  +" и " + b + "наименьший квадрат = " + a2);
		}
			
	}

}
