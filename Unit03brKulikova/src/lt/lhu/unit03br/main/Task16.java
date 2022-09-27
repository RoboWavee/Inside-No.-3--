package lt.lhu.unit03br.main;

/*
 * На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком
координатном угле)
 */

public class Task16 {

	public static void main(String[] args) {

		double x, y;
		x = 89;
		y = 0.7;
		
		if (x == 0 && y == 0) {
			System.out.println("Точка А находится в начале координат");
		}
		
		if (x > 0 && y > 0) {
			System.out.println("Точка А находится в I координатной четверти");
		}
		
		if (x < 0 && y > 0) {
			System.out.println("Точка А находится во II координатной четверти");
		}
		
		if (x < 0 && y < 0) {
			System.out.println("Точка А находится в III координатной четверти");
		}
		
		if (x > 0 && y < 0) {
			System.out.println("Точка А находится в IV координатной четверти");
		}
		
		if (x == 0 && y !=0) {
			System.out.println("Точка А находится на оси X");
		}
		
		if (x != 0 && y ==0) {
			System.out.println("Точка А находится на оси Y");
		}
			
		
	}

}
