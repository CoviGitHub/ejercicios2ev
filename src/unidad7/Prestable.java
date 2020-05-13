package unidad7;

public abstract class Prestable extends Publicacion {

	private boolean prestado;

	public Prestable(int codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		prestado = false;
	}

	public Prestable(int codigo, String titulo, int anio, boolean prestado) {
		super(codigo, titulo, anio);
		this.prestado = prestado;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

}
