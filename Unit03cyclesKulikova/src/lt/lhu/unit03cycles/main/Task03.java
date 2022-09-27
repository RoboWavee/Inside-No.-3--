package lt.lhu.unit03cycles.main;
/*
 * Необходимо вывести на экран таблицу умножения на 3:
 */

public class Task03 {

	public static void main(String[] args) {
		
		int x = 3;
		int i = 0;
		int y = 0;
		
		System.out.println("-------------------------------------------------");
		System.out.printf("|\t%3s\t|\t%3s\t|\t%3s\t|\n", "3", "n", "=");
		System.out.println("-------------------------------------------------");
		
		for (i = 0; i <= 10; i++) {
			y = x * i;
			System.out.printf("|\t%3d\t|\t%3d\t|\t%3d\t|\n", x, i, y);
		}
		System.out.println("-------------------------------------------------");
		
	}

}
