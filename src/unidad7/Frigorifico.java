package unidad7;

public class Frigorifico extends Electrodomestico{

	private boolean noFrost;
	
	public Frigorifico(double precioBase, int peso) {
		super(precioBase, peso);
		super.precioFinal();
		this.noFrost=false;
	}
	
	public Frigorifico(boolean noFrost, double precioBase, Color color, String consEnerg, int peso) {
		super(precioBase, color, consEnerg, peso);
		this.noFrost=noFrost;
		super.precioFinal();
	}

	public boolean isNoFrost() {
		return noFrost;
	}

	@Override
	public String toString() {
		String frost;
		if(noFrost) {
			frost="Frost";
		}else frost="No Frost";
		
		return getClass().getSimpleName()+":\t"+super.toString()+ ", "+ frost +", Precio Final: "
				+ precioFinal();
	}
}
