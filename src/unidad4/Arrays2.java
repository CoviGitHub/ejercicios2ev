package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays2 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int exc = 0;
		int n = 0;

		System.out.println("Introduce el número de secuencias");
		while (exc == 0) {
			try {
				in = new BufferedReader(new InputStreamReader(System.in));
				n = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
		int[][] result = new int[n][];

		for (int i = 0; i < result.length; i++) {
			System.out.println("\nSecuencia " + (i + 1));
			result[i] = datosSec();
		}
		System.out.println("Nº secuencias: " + result.length);
		for (int i = 0; i < result.length; i++) {
			System.out.print("\nLa secuencia " + (i + 1) + " tiene " + result[i].length
					+ (result[i].length == 1 ? " elemento." : " elementos.") + "\n"
					+ (result[i].length == 1 ? "Su elemento es: " : "Sus elementos son: "));
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[] datosSec() throws IOException {
		System.out.println("Introduce la cantidad de números y los números de esta secuencia ");
		int exc = 0;
		int n = 0;
		while (exc == 0) {
			try {
				in = new BufferedReader(new InputStreamReader(System.in));
				n = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.println("No es un número entero, inténtalo de nuevo.");
				exc = 0;
			}
		}
		int[] datosV = new int[n];
		for (int i = 0; i < datosV.length; i++) {
			int excc = 0;
			int num = 0;
			while (excc == 0) {
				try {
					in = new BufferedReader(new InputStreamReader(System.in));
					num = Integer.parseInt(in.readLine());
					excc = 1;
				} catch (NumberFormatException ex) {
					System.out.println("No es un número entero, inténtalo de nuevo.");
					excc = 0;
				}
			}
			datosV[i] = num;
		}
		return datosV;
	}

}
