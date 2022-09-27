package lt.lhu.unit03br.main;

/*
 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их
суммы, а большее — их удвоенным произведением.
 */

public class Task15 {

	public static void main(String[] args) {
		
		double a, b;
		
		a = 8;
		b = 4;
		
		if (a < b) {
			a = (a + b) / 2;
			b = (a * b) * 2;
		} else {
			b = (a + b) / 2;
			a = (a * b) * 2;
		}
		
		System.out.println(a + ", " + b);
		
	}

}
