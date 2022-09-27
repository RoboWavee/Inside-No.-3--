package lt.lhu.unit03br.main;

/*
 Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране
«спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если
денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы
 */

public class Task34 {

	public static void main(String[] args) {
		
		float cost, summ, change, add;
		cost = 15.9F;
		summ = 17.5F;
		change = 0;
		add = 0;
		
		if (summ == cost) {
			System.out.println("Thank you!");
		}
		if (summ > cost) {
			change = summ - cost;
			System.out.println("Take your change: ");
			System.out.format("%.2f", change);
		}
		if (summ < cost) {
			add = cost - summ;
			System.out.println("Not enough money. Add: ");
			System.out.format("%.2f", add);
		}
		
	}

}
