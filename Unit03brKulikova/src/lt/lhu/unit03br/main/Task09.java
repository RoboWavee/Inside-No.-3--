package lt.lhu.unit03br.main;

/*
Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
равносторонним
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Введите значения сторон треугольника\n> ");
		
		while (!num.hasNextDouble()) {
			num.nextLine();
			System.out.println("Вы не ввели числовые значения\n> ");
		}
		
		a = num.nextDouble();
		b = num.nextDouble();
		c = num.nextDouble();
		
		if (a == b && b == c) {
			System.out.println("Треугольник равносторонний");			
		} else {
			System.out.println("Треугольник не равносторонний");
		}


	}

}
