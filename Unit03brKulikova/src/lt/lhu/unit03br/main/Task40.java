package lt.lhu.unit03br.main;

public class Task40 {

	public static void main(String[] args) {

		double x = 10;
		double fx = 0;
		
		if (x <= 13) {
			fx = -(Math.pow(x, 3)) +9;
		} else {
			fx = -(3 / (x +1));
		}
		System.out.println(fx);

	}

}
