package lt.lhu.unit03cycles.main;
/*
 *  Требуется определить факториал числа, которое ввел пользователь
 */
import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int n;
		
		System.out.println("Введите целое неотрицательное число\n>  ");
		
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("Вы не ввели число");
			System.out.println("> ");
		}
		
		n = num.nextInt();
		int pr = 1;
		
		for (int i = 1; i <= n; i++) {
			pr = pr * i;
		}
		
		System.out.println(pr);
		num.close();
	}

}
