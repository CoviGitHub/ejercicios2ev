package unidad4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			num.add((int) (Math.floor(Math.random() * 100 + 1)));
		}
		System.out.println("100 numeros aleatorios listados con for");
		for (Integer numOrig : num)
			System.out.print(numOrig + "  ");

		System.out.println("\nLista original sin duplicados listados con Iterator");
		Set<Integer> num2 = new HashSet<Integer>(num);
		Iterator<Integer> i = num2.iterator();
		while (i.hasNext()) {
			Integer num3 = i.next();
			System.out.print(num3 + "  ");
		}

		System.out.println("\nLista original sin duplicados listados con forEach");
		Set<Integer> num4 = new HashSet<Integer>(num);
		num4.forEach(num5 -> System.out.print(num5 + "  "));
		
	}

}
