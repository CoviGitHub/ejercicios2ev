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
			case 'á':
				a++;
				break;
			case 'e':
			case 'é':
				e++;
				break;
			case 'i':
			case 'í':
				i++;
				break;
			case 'o':
			case 'ó':
				o++;
				break;
			case 'u':
			case 'ú':
				u++;
				break;
			default:
				System.out.println("No hay vocales");
				break;
			}
		}
		if (cad.length() > 0) {
			System.out.println("El caracter a(á) se repite " + a + ((a == 1) ? " vez." : "veces."));
			System.out.println("El caracter e(é) se repite " + e + ((e == 1) ? " vez." : "veces."));
			System.out.println("El caracter i(í) se repite " + i + ((i == 1) ? " vez." : "veces."));
			System.out.println("El caracter o(ó) se repite " + o + ((o == 1) ? " vez." : "veces."));
			System.out.println("El caracter u(ú) se repite " + u + ((u == 1) ? " vez." : "veces."));
		} else
			System.out.print("La cadena está vacía");

		in.close();
	}

}
