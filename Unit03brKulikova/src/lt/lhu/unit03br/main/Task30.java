package lt.lhu.unit03br.main;

/*
 Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если
это не так
 */

public class Task30 {

	public static void main(String[] args) {
		
		int a, b, c;
		a = -7;
		b = 4;
		c = -3;
		
		if (a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		
		System.out.println(a + ", " + b + ", " + c);		
		
	}

}
