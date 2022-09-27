package lt.lhu.unit03br.main;

public class Task36 {

	public static void main(String[] args) {
		
		double x = 1;
		double fx = 0;
		
		if (x <=3) {
			fx = Math.pow(x, 2) - (3 * x) + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println(fx);

	}

}
