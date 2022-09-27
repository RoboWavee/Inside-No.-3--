package lt.lhu.unit03br.main;

/*
 Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.
 */

public class Task22 {

	public static void main(String[] args) {

		int x, y;
		
		x = 81;
		y = 185;
		
		int tempx, tempy;
		
		tempx = 0;
		tempy = 0;
		
		if (x < y) {
			tempx = y;
			tempy = x;
		} else {
			tempx = x;
			tempy = y;
		}
		
		x = tempx;
		y = tempy;
		
		System.out.println(x + ", " + y);

	}

}
