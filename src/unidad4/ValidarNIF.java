package unidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidarNIF {
	static public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String NIF = verifDNI(in.readLine().toUpperCase());
		System.out.println(NIF);
	}

	public static String verifDNI(String DNI) throws IOException {
		String[] letrasNIF = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };
		String copyDNI = DNI;
		try {
			// Caso de NIE extranjero
			if (DNI.substring(0, 1).equals("X")) {
				DNI = "0" + DNI.substring(1);
			}else if (DNI.substring(0, 1).equals("Y")) {
				DNI = "1" + DNI.substring(1);
			} else if (DNI.substring(0, 1).equals("Z")) {
				DNI = "2" + DNI.substring(1);
			}
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.print("Entrada no válida.");
			System.exit(1);
		}
		int numDNI = 0;

		try {
			numDNI = Integer.parseInt(DNI.substring(0, DNI.length() - 1));
		} catch (NumberFormatException ex) {
			System.out.print("Entrada no válida");
			System.exit(1);
		}
		int res = numDNI % 23;

		String letraNIF = "";
		for (int i = 0; i <= letrasNIF.length; i++) {
			if (res == i) {
				letraNIF = letrasNIF[i];
			}
		}
		DNI = DNI.substring(0, DNI.length() - 1) + letraNIF;
		if (copyDNI.equals(DNI)) {
			return "DNI Correcto";
		} else
			return copyDNI + " Incorrecto.\nDNI correcto: " + copyDNI.substring(0, DNI.length() - 1) + letraNIF;
	
	}
}
