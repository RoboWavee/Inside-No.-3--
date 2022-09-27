package lt.lhu.unit03br.main;

/*
Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
 */

public class Task07 {

	public static void main(String[] args) {
		
		int a, b, c, x;
		a = -8;
		b = -2;
		c = -2;
		x = -7;
		
		int mod;
		
		mod = a * x * x + b * x + c;
		
		if (mod < 0) {
			mod *=-1;
			System.out.println("Модуль выражения = " + mod);
		}
		
	}

}
