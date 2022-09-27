package lt.lhu.unit03br.main;

/*
  Составить программу: равны ли два числа а и b?
 */

import java.util.Scanner;

public class Task04 {

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
		} else {
			System.out.println("The numbers are not equal");
		}
	}

}