package unidad5;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Iker", LocalDate.of(2000, 11, 21));
		System.out.println("Nombre: " + animal1.getNombre() + "\nEdad: " + animal1.getEdad() + " años");
	}

}
