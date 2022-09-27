package lt.lhu.unit03cycles.main;
/*
 * C помощью оператора while напишите программу определения суммы всех нечетных чисел в
диапазоне от 1 до 99 включительно.
 */
public class Task05 {

	public static void main(String[] args) {
		
		int x = 1;
		int sum = 0;
		
		while (x <= 99) {
			sum = sum + x;
			x = x + 2;					
		}
		
		System.out.println(sum);
	}

}
