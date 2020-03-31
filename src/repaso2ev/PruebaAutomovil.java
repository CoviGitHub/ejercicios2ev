package repaso2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class PruebaAutomovil {

	public static void main(String[] args) throws IOException {

		HashMap<String, Automovil> autos = new HashMap<String, Automovil>();
		leerAutos(autos);
		System.out.println("-------------------");
		procesar(autos);
	}

	static void leerAutos(HashMap<String, Automovil> auto) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));// Mantengo las 2, por alguna razon que
																					// desconozco aún,
		Scanner teclado = new Scanner(System.in); // genera error si aplico solo uno de ellos.
		int numAuto = teclado.nextInt();
		for (int i = 0; i < numAuto; i++) {
			for (String s : in.readLine().split("\n")) {
				String[] datosAuto = s.split(" ");
				auto.put(datosAuto[0], new Automovil(datosAuto[0], Integer.parseInt(datosAuto[1]),
						Integer.parseInt(datosAuto[2]), Float.parseFloat(datosAuto[3])));
			}
		}
		while (!(teclado.next()).trim().equals("fin")) {
			String autoMap = teclado.next();
				Automovil vehiculo = auto.get(autoMap);
				vehiculo.desplazarse(teclado.nextInt());
				if (vehiculo.isViaje()) {
					System.out.printf("%s %.2f %.2f\n", vehiculo.getModelo(), vehiculo.getCombustDepo(),
							vehiculo.getTotalConsum());
				} else
					System.out.println("Combustible insuficiente para este desplazamiento");
		}
		teclado.close();
	}

	static void procesar(HashMap<String, Automovil> autos) throws IOException {
		Iterator<Entry<String, Automovil>> i = autos.entrySet().iterator();
		while (i.hasNext()) {
			Entry<String, Automovil> a = i.next();
			System.out.printf(a.getKey() + " " + a.getValue());
		}
	}

}