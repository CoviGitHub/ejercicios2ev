package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vectores3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tamV = 0;
		System.out.println("Introduce el tamaño del vector entre 10 y 200");

		while (tamV < 10 || tamV > 200) {
			try {
				tamV = Integer.parseInt(in.readLine());
			} catch (NumberFormatException ex) {
				System.out.print("Entrada no válida");
			}
		}
		int[] v = new int[tamV];
		int sumaNum = 0;

		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) Math.floor(Math.random() * 201 - 100);
			System.out.println("Pos " + i + "\t" + v[i]);
			sum += v[i];
		}
		System.out.println("\nSuma total del vector: " + sum + "\n");

		int[] numExcl = new int[v.length];
		int count13 = 0;

		for (int i = 0; i < v.length; i++) {
			if (v[i] != 13) {
				sumaNum += v[i];
			} else if (v[i] == 13) {
				count13++;
				numExcl[i] = v[i];
				int suma7 = 0;
				if ((v.length - i) > 13) {
					for (int j = i + 1; j < i + 14; j++) {
						numExcl[j] = v[j];
						suma7 += v[j];
					}
				} else {
					for (int j = i + 1; j < v.length; j++) {
						numExcl[j] = v[j];
						suma7 += v[j];
					}
				}
				System.out.println(
						"Suma de los 13 elementos siguientes (o hasta fin del vector) al valor 13 situado en posición "
								+ i + ": " + suma7);

				if (suma7 == 7) {
					if ((v.length - i) > 13) {
						for (int j = i + 1; j < i + 14; j++) {
							numExcl[j] = 0;
						}
					} else {
						for (int j = i + 1; j < v.length; j++) {
							numExcl[j] = 0;
						}
					}
					sumaNum += suma7;
				}

				if ((v.length - i) < 13) {
					i = v.length;
				} else
					i += 13;
			} else
				sumaNum += v[i];
		}
		System.out.println("\nEl valor 13 principal salió " + count13 + ((count13 == 1) ? " vez.\n" : " veces.\n"));

		int sumaExcl = 0;
		int countExcl = 0;
		for (int i = 0; i < numExcl.length; i++) {
			if (numExcl[i] != 0) {
				countExcl++;
				sumaExcl += numExcl[i];
				System.out.print(numExcl[i] + "  ");
			}
		}
		System.out.print("\n" + countExcl
				+ ((countExcl == 1) ? " valor no incluido. Suma: " : " valores no incluidos. Suma: ") + sumaExcl);

		System.out.println("\n\n" + sumaNum
				+ " es la suma de números que no son 13 ni los siguientes 13 números a éste que tengan una suma distinta de 7.");
	}

}
