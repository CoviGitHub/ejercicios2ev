package unidad7;

import java.io.IOException;
import java.util.TreeSet;

public class Venta {
	public static TreeSet<Electrodomestico> electrodomesticos = new TreeSet<Electrodomestico>();

	public static void main(String[] args) throws IOException {

		try {
			Lavadora lavadora1 = new Lavadora(200, 5);
			Televisor tele1 = new Televisor(95, 5);
			Frigorifico frigo1 = new Frigorifico(200, 8);

			Electrodomestico electro2 = new Lavadora(10, 100, Color.GRIS, "B", 20);
			Electrodomestico electro5 = new Lavadora(5, 300, Color.AZUL, "A", 10);
			Electrodomestico electro1 = tele1;
			Electrodomestico electro4 = lavadora1;
			Electrodomestico electro3 = frigo1;

			electrodomesticos.add(electro1);
			electrodomesticos.add(electro5);
			electrodomesticos.add(electro3);
			electrodomesticos.add(electro2);
			electrodomesticos.add(electro4);

			for (Electrodomestico e : electrodomesticos) {
				System.out.println(e);
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
