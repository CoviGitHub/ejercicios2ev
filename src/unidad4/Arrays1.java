package unidad4;

public class Arrays1 {

	public static void main(String[] args) {

		int[][] m = new int[(int) Math.floor(Math.random() * 19 + 2)][(int) Math.floor(Math.random() * 19 + 2)];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) Math.floor(Math.random() * 51 + 1);
			}
		}
		System.out.println("Resultado suma filas, suma columnas\n");

		resultM(m, sumaFila(m), sumaCol(m));
	}

	public static int[] sumaFila(int[][] matriz) {
		int[] sumaFila = new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			int sumFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumFila += matriz[i][j];
			}
			sumaFila[i] = sumFila;
		}
		return sumaFila;
	}

	public static int[] sumaCol(int[][] matriz) {
		int[] sumaCol = new int[matriz[0].length];
		int sumCol;
		for (int i = 0; i < matriz[0].length; i++) {
			sumCol = 0;
			for (int j = 0; j < matriz.length; j++) {
				sumCol += matriz[j][i];
			}
			sumaCol[i] = sumCol;
		}
		return sumaCol;
	}

	public static void resultM(int[][] m, int[] sumF, int[] sumC) {

		int sumaTotal = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " \t");
				sumaTotal += m[i][j];
			}
			System.out.print("=\t" + sumF[i] + "\n");
		}
		System.out.println();

		for (int i = 0; i < sumC.length; i++) {
			System.out.print(sumC[i] + "\t");
		}
		System.out.print("Total:\t" + sumaTotal);
	}

}
