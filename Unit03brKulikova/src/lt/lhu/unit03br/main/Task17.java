package lt.lhu.unit03br.main;

/*
 *  Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
из исходных, а если равны, то заменить числа нулями
 */

public class Task17 {

	public static void main(String[] args) {
		
		int a, b;
		a = 59;
		b = 2;
		
		System.out.println("Исходные числа: " + a + ", " + b);
		
		
		if (a == b) {
			a = 0;
			b = 0;
		}
		
		if (a < b) {
			a = b;
		}
		
		if (a > b) {
			b = a;
		}
		
		System.out.println("Новые числа: " + a + ", " + b);

	}

}
