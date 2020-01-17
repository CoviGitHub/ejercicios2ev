package unidad4;

import java.util.Scanner;

public class Cadenas2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduce una cadena.");
		String cad = in.nextLine();
		String nuevaCad = "";

		for (int i = cad.length() - 1; i >= 0; i--) {
			nuevaCad += cad.charAt(i);
		}
		if (cad.length() > 0) {
			System.out.println("Cadena invertida: " + nuevaCad);
		} else
			System.out.println("La cadena está vacía");
		in.close();
	}

}
