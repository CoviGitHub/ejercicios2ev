package unidad7;

public class Televisor extends Electrodomestico {

	private int pulgadas;
	private String tipoSint;

	public Televisor(double precioBase, int peso) {
		super(precioBase, peso);
		this.pulgadas = 20;
		this.tipoSint = "DVB-T";
		super.precioFinal();
	}

	public Televisor(int pulgadas, String tipoSint, double precioBase, Color color, String consEnerg, int peso) {
		super(precioBase, color, consEnerg, peso);
		if (pulgadas < 17 || tipoSint == null) {
			throw new IllegalArgumentException("");
		}
		this.pulgadas = pulgadas;
		if (tipoSint != "DVB-T" && tipoSint != "DVB-T2") {
			throw new IllegalArgumentException("Tipos Sintonización: DVB-T o DVB-T2");
		}
		this.tipoSint = tipoSint;
		super.precioFinal();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ":\t" + super.toString() + ", " + pulgadas + " pulgadas, Sintonización " + tipoSint
				+ ", PrecioFinal: " + precioFinal();
	}

}
