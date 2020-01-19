package unidad4;

public class Vectores7 {

	public static void main(String[] args) {
		int[] v = { 6, 2, 3, 0, 1 };

		String result = centro(v);
		System.out.print((result != null) ? "El centro es el índice: " + result : "No tiene centro");
	}

	public static String centro(int[] vect) {
		double a = 0;
		double b = 0;
		int c = 1;
		String centro = "";
		for (int i = 0; i < c; i++) {
			a += (c - i) * vect[i];
		}
		for (int j = c + 1; j < vect.length; j++) {
			b += (j - c) * vect[j];

		}
		if (a == b && a != 0) {
			centro = "" + (int) (a / b);
			return centro;
		} else
			return null;
	}
}
