package unidad7;

import java.util.TreeSet;

public class Biblioteca {

	public static TreeSet<Publicacion> listaPublicaciones = new TreeSet<>();

	public static void main(String[] args) {

		Libro libro1 = new Libro(3, "La bella tormenta", 2018);
		libro1.setPrestado(true);
		// Polimorfismo, Revistas y Libros son publicaciones y,
		// toda referencia a un objeto de una superclase puede tomar- la forma de una
		// referencia a un objeto de una subclase heredada de la superclase.
		Publicacion publi2 = libro1;
		Publicacion publi3 = new Libro(1, "La ciudad perdida", 2019);
		Publicacion publi1 = new Revista(4, "Le magazin", 2020, 02, 20, 1);

		listaPublicaciones.add(publi2);
		listaPublicaciones.add(publi1);
		listaPublicaciones.add(publi3);

		for (Publicacion p : listaPublicaciones) {
			System.out.println(p);
		}
	}

}
