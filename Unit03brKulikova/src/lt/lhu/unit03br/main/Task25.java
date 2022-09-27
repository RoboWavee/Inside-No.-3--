package lt.lhu.unit03br.main;

import java.util.Scanner;

/*
 * Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
«Пожароопасная ситуация », если температура в комнате превысила 60° С.
 */

public class Task25 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		double t;
		
		while (!num.hasNextDouble()) {
			num.nextLine();
		}
		
		t = num.nextDouble();
		
		if (t > 60) {
			System.out.println("Пожароопасная ситуация");
		}

	}

}
