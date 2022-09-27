package lt.lhu.unit03br.main;

/*
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В
зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!»
 */
import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М\n > ");
		
		Scanner str = new Scanner(System.in);
		
		char name;
		name = str.next().charAt(0);
		
		switch (name) {
		case 'Д':
			System.out.println("Мне нравятся девочки!");
			break;
		case 'М':
			System.out.println("Мне нравятся мальчики!");
			break;
		default :
			System.out.println("Мне никто не нравится");
		
		}
		
	}

}
