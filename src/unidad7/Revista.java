package unidad7;

public class Revista extends Publicacion {

	private int num;
	private int mes;
	private int dia;

	public Revista(int codigo, String titulo, int anio, int mes, int dia, int num) {
		super(codigo, titulo, anio);
		this.num = num;
		this.mes = mes;
		this.dia = dia;
	}

	public int getNum() {
		return num;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [" + super.getCodigo() + ", " + super.getTitulo()
				+ ", F/publicación: " + dia + "\\" + mes + "\\" + super.getAnio() + ", Nº Revista: " + num + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Revista other = (Revista) obj;
		if (num != other.num)
			return false;
		return true;
	}

}
