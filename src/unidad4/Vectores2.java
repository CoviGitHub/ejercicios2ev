package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vectores2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Indica el tamaño del vector, entre 10 y 1.000.000");
		int tamV = 0;
		do {
			try {
				tamV = Integer.parseInt(in.readLine());
			} catch (NumberFormatException ex) {
				System.out.println("Entrada no válida, tamaño entre 10 y 1.000.000");
			}
		} while (tamV < 10 || tamV > 1000000);
		int[] v = new int[tamV];

		long ini = System.nanoTime();
		v[0] = (int) Math.floor(Math.random() * 2000000 - 1000000);
		for (int i = 1; i < v.length; i++) {
			v[i] = (int) Math.floor(Math.random() * 2000000 - 1000000);
			for (int j = 0; j < i; j++) {
				if (v[j] == v[i]) {
					v[i] = (int) Math.floor(Math.random() * 2000000 - 1000000);
				}
			}
		}
		System.out.println("\nVector 1        Vector 2");
		for (int j = 0; j < v.length; j++) {
			System.out.println("Pos " + j + ":\t" + v[j]);
		}
		long fin = System.nanoTime();
		float tempo = (float) (fin - ini) / 1_000_000_000;

		int menor = v[0];
		int mayor = v[0];
		long iniDif = System.nanoTime();
		for (int i = 0; i < v.length; i++) {
			if (v[i] < menor) {
				menor = v[i];
			}
			if (v[i] > mayor) {
				mayor = v[i];
			}
		}
		int Dif = mayor - menor;
		long finDif = System.nanoTime();
		float tempoDif = (float) (finDif - iniDif) / 1_000_000_000;

		System.out.println("\nTamaño del vector: " + v.length);
		System.out.printf("Tiempo empleado en rellenar el vector: %.9f segundos.\n", tempo);
		System.out.println("Elemento mayor: " + mayor + ", elemento menor: " + menor + ", diferencia: " + Dif);
		System.out.printf("Tiempo empleado en obtener dicha diferencia: %.9f segundos", tempoDif);

		in.close();
	}

}
