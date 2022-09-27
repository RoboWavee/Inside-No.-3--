package lt.lhu.unit03br.main;
/*
 * Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в
базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют
следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 —
доступен модуль базы С.
 */
import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		
		System.out.println("Введите пароль\n>  ");
		
		Scanner num = new Scanner(System.in);
		
		int abc1, abc2, bc1, bc2, c1, c2;
		
		abc1 = 9583;
		abc2 = 1747;
		bc1 = 3331;
		bc2 = 7922;
		c1 = 9455;
		c2 = 8997;
		
		int pass;
		
		while (!num.hasNextInt()) {
			num.nextLine();
			System.out.println("Вы не ввели пароль");
			System.out.println("> ");
		}
		
		pass = num.nextInt();
		
		if (pass == abc1 || pass == abc2) {
			System.out.println("Открыт доступ к базам A, B, C");
		}
		if (pass == bc1 || pass == bc2) {
			System.out.println("Открыт доступ к базам B, C");
		}
		if (pass == c1 || pass == c2) {
			System.out.println("Открыт доступ к базе C");			
		}
		if (pass != abc1 && pass != abc2 && pass != bc1 && pass != bc2 && pass != c1 && pass != c2) {
			System.out.println("У вас нет доступа к базам. Лучше отдохните и выпейте чаю");
		}
		
		num.close();
		

	}

}
