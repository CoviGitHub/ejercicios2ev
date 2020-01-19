package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vectores5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int numElem = 0;
		while (numElem < 10 || numElem > 20) {
			try {
				System.out.println("Introduce el número de elementos del vector, entre 10 y 20");
				numElem = Integer.parseInt(in.readLine());
			} catch (NumberFormatException ex) {
				System.out.println("Entrada no válida");
			}
		}

		int[] v = new int[numElem];
		int[] vAux = new int[numElem - 1];
		int minDif = 0;
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) Math.floor(Math.random() * 101 + 1);
		}
		for (int i = 1; i < v.length; i++) {
			for (int j = 0; j < vAux.length; j++) {
				vAux[j] = v[j + 1] - v[j];
				if (vAux[j] < minDif) {
					minDif = vAux[j];
				}
			}
		}
		System.out.println("Elementos del vector");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + "  ");
		}
		System.out.println("\nDiferencias entre 2 elementos adyacentes.");
		for (int i = 0; i < vAux.length; i++) {
			System.out.print(vAux[i] + "  ");
		}
		System.out.print("\nLa mínima diferencia es: " + minDif);
	}

}
