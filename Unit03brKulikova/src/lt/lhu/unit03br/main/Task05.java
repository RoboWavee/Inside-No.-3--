package lt.lhu.unit03br.main;

/*
Составить программу: определения наименьшего из двух чисел а и b.
 */

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Enter two numbers");
		System.out.println("> ");
		
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("You didn't enter numbers");
			System.out.println("> ");
		}
		
		a = num.nextInt();
		b = num.nextInt();
		
		if (a == b) {
			System.out.println("The numbers are equal");
		} else if (a < b) {
			System.out.println("Smalles number = a");
		} else {
			System.out.println("Smalles number = b");
		}
		
	}

}
