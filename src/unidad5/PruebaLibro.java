package unidad5;

import java.util.ArrayList;

public class PruebaLibro {

	public static void main(String[] args) {
		ArrayList<Autor> autores= new ArrayList<>();
		autores.add(new Autor("María Martínez","mmartinez@gmail.com",Genero.FEMENINO));
		autores.add(new Autor("Juan Sánchez","jsanchez@gmail.com",Genero.MASCULINO));
		Libro libro= new Libro("La caja de los truenos", autores ,15f,10);
		System.out.println(libro);
	}

}
