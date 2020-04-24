package unidad6;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PruebaMascotas {

	static HashMap<String, Mascota> mascotas = new HashMap<String, Mascota>();

	public static void main(String[] args) {
		Scanner linea = new Scanner(System.in);
		do {
			System.out.print("> ");
		} while (ejecutarComando(linea.nextLine()));
		linea.close();
	}

	static boolean ejecutarComando(String cmd) throws NoSuchElementException {
		Scanner in = new Scanner(cmd);
		in.useDelimiter(" ");
		String s = "";
		try {
			s = in.next();
		} catch (NoSuchElementException e) {
			System.out.println("Introduce un comando");
		}

		if (s.equals("crear")) {
			String animal = "";
			try {
				animal = in.nextLine();
				animal = animal.trim();
				if (!mascotas.isEmpty()) {
					if (!mascotas.containsKey(animal)) {
						Mascota mascota = new Mascota(animal);
						mascotas.put(animal, mascota);
					} else {
						System.out.println(animal + " ya existe");
					}
				} else {
					Mascota mascota = new Mascota(animal);
					mascotas.put(animal, mascota);
				}
			} catch (NoSuchElementException e) {
				System.out.println("Introduce el nombre de una mascota");
			}

		} else if (s.equals("comer")) {
			String animal = "";
			try {
				animal = in.nextLine();
				animal = animal.trim();
				if (mascotas.get(animal) != null) {
					Mascota mascota = mascotas.get(animal);
					mascota.comer();
					if (!mascota.estaVivo()) {
						mascotas.remove(animal);
						System.out.println("Lamentamos comunicarle el fallecimiento de " + animal);
					} else
						System.out.println(mascota);
				} else
					System.out.print(animal + " no existe\n");
			} catch (NoSuchElementException e) {
				System.out.println("Introduce el nombre de una mascota");
			}

		} else if (s.equals("ejercicio")) {
			String animal = "";
			try {
				animal = in.nextLine();
				animal = animal.trim();
				if (mascotas.get(animal) != null) {
					Mascota mascota = mascotas.get(animal);
					mascota.ejercicio();
					if (!mascota.estaVivo()) {
						mascotas.remove(animal);
						System.out.println("Lamentamos comunicarle el fallecimiento de " + animal);
					} else
						System.out.println(mascota);
				} else
					System.out.print(animal + " no existe\n");
			} catch (NoSuchElementException e) {
				System.out.println("Introduce el nombre de una mascota");
			}

		} else if (s.equals("dormir")) {
			String animal = "";
			try {
				animal = in.nextLine();
				animal = animal.trim();
				if (mascotas.get(animal) != null) {
					Mascota mascota = mascotas.get(animal);
					mascota.dormir();
					if (!mascota.estaVivo()) {
						mascotas.remove(animal);
						System.out.println("Lamentamos comunicarle el fallecimiento de " + animal);
					} else
						System.out.println(mascota);
				} else
					System.out.print(animal + " no existe\n");
			} catch (NoSuchElementException e) {
				System.out.println("Introduce el nombre de una mascota");
			}

		} else if (s.equals("curar")) {
			String animal = "";
			try {
				animal = in.nextLine();
				animal = animal.trim();
				if (mascotas.get(animal) != null) {
					Mascota mascota = mascotas.get(animal);
					System.out.println(mascota.curar() + mascota);
				} else
					System.out.print(animal + " no existe\n");
			} catch (NoSuchElementException e) {
				System.out.println("Introduce el nombre de una mascota");
			}

		} else if (s.equals("salir")) {
			in.close();
			return false;
		}
		in.close();
		return true;
	}
}
