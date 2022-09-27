package lt.lhu.unit03br.main;

public class Task39 {

	public static void main(String[] args) {

		double x = 2;
		double fx = 0;
		
		if (x >= 8) {
			fx = -(Math.pow(x, 2)) + x - 9;
		} else {
			fx = 1 / (Math.pow(x, 4) - 6);
		}
		System.out.println(fx);
	}

}
