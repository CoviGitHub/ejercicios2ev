package unidad4.colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Set<String>nombres = new LinkedHashSet<String>();	
		System.out.println("Introduce el número de nombres");
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			nombres.add(in.next());
		}
		System.out.println("Orden de entrada sin repeticiones");
		System.out.println(nombres);	
		in.close();

	}

}
