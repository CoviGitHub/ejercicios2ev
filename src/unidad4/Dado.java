package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class Dado {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[] countCara = new int[6];
		int veces = 0;	
		
		System.out.println("Introduce el número de lanzamientos del dado");
		
		int exc = 0;
		while (exc == 0) {
			try {
				veces = Integer.parseInt(in.readLine());
				exc = 1;
			} catch (NumberFormatException ex) {
				System.out.print("Entrada no válida. Introduce un número de lanzamientos del dado.");
				exc = 0;
			}
		}

		for (int i = 0; i < veces; i++) {
			double cara = (int) (Math.floor(Math.random() * 6 + 1));
			System.out.print((int) cara + ((i == veces - 1) ? ".\n\n" : "  "));
			for (int j = 1; j <= 6; j++) {
				if (cara == j) {
					countCara[j - 1]++;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(
					"La cara " + (i + 1) + " salió " + countCara[i] + ((countCara[i] == 1) ? " vez." : " veces."));
		}
		in.close();
	}

}
