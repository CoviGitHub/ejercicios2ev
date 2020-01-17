package unidad4;

import java.util.Scanner;

public class Cadenas3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduce una cadena.");
		String cad1 = in.nextLine();
		System.out.println("Introduce una segunda cadena.");
		String cad2 = in.nextLine();
		int count = 0;
		int i=0;

		if (cad1.length() < cad2.length()||cad1.length()<1)
			System.out.println("La segunda cadena no puede ser más larga que la primera");
		else {
			do {
				i = cad1.indexOf(cad2,i);
				if(i!=-1) {
				i++;
				count++;
				}
			}while(i!=-1);
		}
		System.out.print("La cadena 2 está " + count + ((count == 1) ? " vez " : " veces.") + " en la cadena 1.");
	}

}
