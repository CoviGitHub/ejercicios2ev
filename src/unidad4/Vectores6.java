package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vectores6 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] nomPers = new String[10];
		System.out.println("Introduce 10 nombres");
		for (int i = 0; i < nomPers.length; i++) {
			System.out.print("Nombre " + (i + 1) + ": ");
			nomPers[i] = in.readLine();
		}
		
		String nomMayor = mayorNom(nomPers);
		System.out.println("El nombre de mayor longitud es: " + nomMayor);
	}

	public static String mayorNom(String[] nomPers) {
		int mayor = 0;
		String nomMayor = "";
		for (int i = 0; i < nomPers.length; i++) {
			if (nomPers[i].length() > mayor) {
				mayor = nomPers[i].length();
				nomMayor = nomPers[i];
			}
		}
		return nomMayor;
	}

}
