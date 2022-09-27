package lt.lhu.unit03br.main;

/*
Составить программу сравнения введенного числа а и цифры 3. 
Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
 */

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter a number");
		System.out.println("> ");
		
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("You didn't enter a number");
			System.out.println("> ");
		}
		
		a = num.nextInt();
		
		if (a < 3) {
			System.out.println("yes");			
		} else {
			System.out.println("no");
		}
				
	}

}
