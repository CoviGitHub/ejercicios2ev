package unidad4;

import java.util.Scanner;

public class Cadenas1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;

		System.out.println("Introduce una cadena.");
		String cad = in.nextLine().toLowerCase();

		for (int ind = 0; ind < cad.length(); ind++) {
			char letra = cad.charAt(ind);

			switch (letra) {
			case 'a':
			case '�':
				a++;
				break;
			case 'e':
			case '�':
				e++;
				break;
			case 'i':
			case '�':
				i++;
				break;
			case 'o':
			case '�':
				o++;
				break;
			case 'u':
			case '�':
				u++;
				break;
			default:
				System.out.println("No hay vocales");
				break;
			}
		}
		if (cad.length() > 0) {
			System.out.println("El caracter a(�) se repite " + a + ((a == 1) ? " vez." : "veces."));
			System.out.println("El caracter e(�) se repite " + e + ((e == 1) ? " vez." : "veces."));
			System.out.println("El caracter i(�) se repite " + i + ((i == 1) ? " vez." : "veces."));
			System.out.println("El caracter o(�) se repite " + o + ((o == 1) ? " vez." : "veces."));
			System.out.println("El caracter u(�) se repite " + u + ((u == 1) ? " vez." : "veces."));
		} else
			System.out.print("La cadena est� vac�a");

		in.close();
	}

}
