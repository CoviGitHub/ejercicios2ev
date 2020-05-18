package unidad7;

public class Lavadora extends Electrodomestico {

	private int carga;

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = 5;
	}

	public Lavadora(int carga, double precioBase, Color color, String consEnerg, int peso) {
		super(precioBase, color, consEnerg, peso);
		if (carga != 4 && carga != 5 && carga != 6 && carga != 7 && carga != 8 && carga != 10 && carga != 11
				&& carga != 13) {
			throw new IllegalArgumentException("La carga de lavadora ha de ser: 4, 5, 6, 7, 8, 10, 11 o 13");
		}
		this.carga = carga;
	}

	@Override
	public double precioFinal() {
		double precioFin=super.precioFinal();
		if (this.carga > 8) 
			precioFin += getPrecioBase() * 0.1;
		return precioFin;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ":\t" + super.toString() + " Carga: " + carga + ", PrecioFinal: "
				+ precioFinal();
	}

}
