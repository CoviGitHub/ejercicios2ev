package unidad7;

public class Lavadora extends Electrodomestico{
	
	private double precioFin;
	private int carga;
	
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = 5;
		precioFin=super.precioFinal();
	}
	
	public Lavadora(int carga, double precioBase, Color color, String consEnerg, int peso) {	
		super(precioBase, color, consEnerg, peso);
		if(carga!=4&&carga!=5&&carga!=6&&carga!=7&&carga!=8&&carga!=10&&carga!=11&&carga!=13) {
			throw new IllegalArgumentException("La carga de lavadora ha de ser: 4, 5, 6, 7, 8, 10, 11 o 13");
		}
		this.carga=carga;
		super.precioFinal();
		if(carga>8) {
			precioFin=super.precioFinal()+(precioBase*0.1);
		}else {
			precioFin=super.precioFinal();
		}
	}

	/*@Override
	public String toString() {
		return "Lavadora [precioFin=" + precioFin + ", carga=" + carga + ", getPrecioBase()=" + getPrecioBase()
				+ ", getColor()=" + getColor() + ", getConsEnerg()=" + getConsEnerg() + ", getPeso()=" + getPeso()
				+ ", precioFinal()=" + precioFinal() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}*/

	@Override
	public String toString() {
		return getClass().getSimpleName()+":\t"+super.toString()+" Carga: " + carga+ ", PrecioFinal: " + precioFin;
	
	}
	
	
	
}
