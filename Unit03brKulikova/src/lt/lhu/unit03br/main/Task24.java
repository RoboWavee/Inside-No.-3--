package lt.lhu.unit03br.main;

/*
Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное
данное количество лепестков п
 */
import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		System.out.println("Сколько у вашей ромашки лепестков?\n>  ");
		
		Scanner num = new Scanner(System.in);
		
		int n;
		
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("You didn't enter a number");
			System.out.println("> ");
		}
		
		n = num.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Не любит. Мне жаль");
		} else {
			System.out.println("Любит. Совет да любовь");
		}
	}

}
