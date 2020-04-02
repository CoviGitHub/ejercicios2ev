package repaso2ev;
public class Matrices {

	/*private static int[][] m;
	private static String[][] mS;
	
	public Matrices() {
		Matrices.m=new int[0][0];
		Matrices.mS=new String[0][0];
	}

	public static int[][] getM() {
		return m;
	}


	public static String[][] getmS() {
		return mS;
	}*/

	static int[][] cuadrada1(int dim) {
		int conta = 1;
		int [][]m = new int[dim][dim];
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				m[j][i] = conta++;
			}
		}
		return m;
	}

	static int[][] cuadrada2(int dim) {
		int conta = 1;
		int [][]m = new int[dim][dim];
		for (int i = 0; i < dim; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < dim; j++) {
					m[j][i] = conta++;
				}
			} else {
				for (int k = dim - 1; k >= 0; k--) {
					m[k][i] = conta++;
				}
			}
		}
		return m;
	}

	static String[][] palindromos(int f, int c) {
		String[] letra = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String [][]mS = new String[f][c];
		int conta = 0;
		if (f + c > 27 || f < 1 || c < 1) {
			mS[0][0] = "null";
			return mS;
		} else {
			for (int i = 0; i < f; i++) {
				conta = i;
				for (int j = 0; j < c; j++) {
					mS[i][j] = letra[i] + letra[conta] + letra[i];
					conta++;
				}
			}
			return mS;
		}
	}

	static int max3x3sum(int[][] matriz) {
		int suma = 0;
		int mayor = 0;
		if (matriz.length < 3) {
			mayor = 0;
		} else {
			for (int i = 0; i < matriz.length - 2; i++) {
				if (matriz[i].length < 3) {
					mayor = 0;
					return mayor;
				} else {
					for (int j = 0; j < matriz[i].length - 2; j++) {
						for (int k = 0; k < 3; k++) {
							for (int l = 0; l < 3; l++) {
								suma += matriz[i + k][j + l];
							}
						}
						if (suma > mayor) {
							mayor = suma;
							suma = 0;
						} else
							suma = 0;
					}
				}
			}
		}
		return mayor;
	}

	//print Array int
	public int[][] muestraMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("| " + m[i][j] + "\t");
			}
			System.out.println();
		}
		return m;
	}

	//print Array String
	public String[][] muestraMatrizString(String[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("| " + m[i][j] + "\t");
			}
			System.out.println();
		}
		return m;
	}

}
