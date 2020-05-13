package unidad7;

public abstract class Publicacion implements Comparable<Publicacion> {

	private int codigo = 0;
	private String titulo = null;
	private int anio = 0;

	public Publicacion(int codigo, String titulo, int anio) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anio = anio;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnio() {
		return anio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Publicaciones [codigo=" + codigo + ", titulo=" + titulo + ", anio=" + anio + "]";
	}

	@Override
	public final int compareTo(Publicacion obj) {
		// return titulo.compareTo(obj.titulo);
		return codigo - obj.codigo;
	}
}
