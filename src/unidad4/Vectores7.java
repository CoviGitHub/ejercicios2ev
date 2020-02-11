package unidad4;

public class Vectores7 {

	public static void main(String[] args) {
//		int[] v = { 6, 2, 3, 0, 1 };
		int[] v = { 1, 0, 3, 2, 6 };

		Integer result = centro(v);
		System.out.print((result != null) ? "El centro es el índice: " + result : "No tiene centro");
	}

	public static Integer centro(int[] vect) {
		for (int c=1; c<vect.length-1; c++) {
			double a = 0;
			double b = 0;
			
			for (int i = 0; i < c; i++) {
				a += (c - i) * vect[i];
			}
			for (int j = c + 1; j < vect.length; j++) {
				b += (j - c) * vect[j];
			}
			if (a == b)
				return c;
		}
		return null;
	}
}
