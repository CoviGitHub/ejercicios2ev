package unidad7;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Libro extends Prestable {

	private Set<String> autores = new TreeSet<>();

	public Libro(int codigo, String titulo, int a�o) {
		super(codigo, titulo, a�o);
	}

	public Libro(int codigo, String titulo, int a�o, Collection<String> autores) {
		super(codigo, titulo, a�o);
		this.autores.addAll(autores);
	}

	public Libro(int codigo, String titulo, int a�o, String autor) {
		super(codigo, titulo, a�o);
		autores.add(autor);
	}

	public String getAutores() {
		return autores.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((super.getCodigo() == 0) ? 0 : super.getCodigo());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Libro libro = (Libro) obj;
		return getCodigo() == libro.getCodigo();
	}

	public String toString() {
		return this.getClass().getSimpleName() + " [" + super.getCodigo() + ", " + super.getTitulo() + ", "
				+ super.getAnio() + "] " + this.getPrestado();
	}

}
