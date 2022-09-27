package lt.lhu.unit03cycles.main;
/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа
суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int x;
		
		System.out.println("Введите любое целое положительное число\n>  ");
		
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("Введите число");
			System.out.println("> ");
		}
		
		x = num.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while (i <= x) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
		
		num.close();

	}

}
