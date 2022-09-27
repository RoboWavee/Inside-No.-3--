package lt.lhu.unit03cycles.main;
/*
 * Написать программу, переводящую римские цифры в арабские
 */

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int numArab;
		
		System.out.println("Введите цифру\n>  ");
		
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("Вы не ввели цифру");
			System.out.println("> ");
		}
		
		numArab = num.nextInt();
		
		String numLat = "0";
		
		switch (numArab) {
		case 0: numLat = "0"; break;
		case 1: numLat = "I"; break;
		case 2: numLat = "II"; break;
		case 3: numLat = "III"; break;
		case 4: numLat = "IV"; break;
		case 5: numLat = "V"; break	;
		case 6: numLat = "VI"; break;
		case 7: numLat = "VII"; break;
		case 8: numLat = "VIII"; break;
		case 9: numLat = "IX"; break;
		default:
			System.out.println("Цифр нет");		
		}
		
		System.out.println(numLat);
		
	}

}
