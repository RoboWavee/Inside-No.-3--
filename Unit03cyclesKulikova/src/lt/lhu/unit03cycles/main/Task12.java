package lt.lhu.unit03cycles.main;
/*
 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
нахождения произведения первых 10 членов этой последовательности.
 */
public class Task12 {

	public static void main(String[] args) {
		
		int an = 1;
		int ann = 0;
		int pr = 1; //произведение
				
		for (int i = 2; i <= 10; i++) {
			ann = 6 + an;
			an++;			
			pr *= ann;
			
		}
		
		System.out.println(pr);
		System.out.println(an);
		System.out.println(ann);
	}

}
