package lt.lhu.unit03br.main;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он
прямоугольным
 *
 */

public class Task14 {

	public static void main(String[] args) {
		
		double corner1, corner2;
		
		corner1 = 15.89;
		corner2 = 90;
		
		double corner3;
		corner3 = 180 - corner1 - corner2;
		
		if ((corner1 + corner2) >= 180) {
			System.out.println("Takoj treugolnik ne suschestvuet");
		} else if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
			System.out.println("Takoj treugolnik suschestvuet. Ego ugly ravny: " + corner1 + ", " + corner2 + ", " + corner3);
			if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
				System.out.println("Eto prjamougolnyj treugolnik");
			}
		} else {
			System.out.println("Takoj treugolnik ne suschestvuet");
		}
		
		
	}

}
