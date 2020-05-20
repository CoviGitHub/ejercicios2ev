package unidad8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int op = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Elige un libro:\n" + "1. El Quijote UTF8\n" + "2. El Quijote windows-1252");
		while (op != 1 && op != 2) {
			op = in.nextInt();
		}
		eligeLibro(op);
		in.close();
	}

	public static void eligeLibro(int op) {
		String[] arg = { "res/El Quijote UTF8.txt", "res/El Quijote windows-1252.txt" };
		String enc = null;
		if (op == 1) {
			enc = "UTF8";
		} else
			enc = "windows-1252";
		BufferedReader br = null;
		try {
			InputStreamReader fichero = new InputStreamReader(new FileInputStream(arg[op - 1]), enc);
			br = new BufferedReader(fichero);
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (

		FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e) {

		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
