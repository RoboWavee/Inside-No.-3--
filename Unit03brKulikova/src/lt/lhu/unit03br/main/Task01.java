package lt.lhu.unit03br.main;

/*
Составить программу сравнения двух чисел 1 и 2. 
Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
 */

public class Task01 {

	public static void main(String[] args) {

		int a, b;
		a = 1;
		b = 2;
		
		if (a < b) {
			System.out.println("7");
		} else {
			System.out.println("8");
		}

	}

}