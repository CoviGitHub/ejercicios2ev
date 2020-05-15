package unidad7;

import java.util.Objects;

public abstract class Electrodomestico implements Comparable<Electrodomestico> {

	private double precioBase;
	private int peso;
	private Color color;
	private String consEnerg;
	
	public Electrodomestico() {
		super();
		this.precioBase = 100;
		this.peso = 5;
		this.color = Color.BLANCO;
		this.consEnerg = "F";
	}

	public Electrodomestico(double precioBase, int peso) {
		if (precioBase <= 0 || peso <= 0) {
			throw new IllegalArgumentException("Campos obligatorios precio base y peso del electrodoméstico");
		}
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = Color.BLANCO;
		this.consEnerg="F";	
	}

	public Electrodomestico(double precioBase, Color color, String consEnerg, int peso) {
		if (precioBase <= 0 || color == null || consEnerg == null || peso <= 0) {
			throw new IllegalArgumentException("Campos obligatorios: precio base, color, consumo energético y peso");
		}
		if (consEnerg != "A" && consEnerg != "B" && consEnerg != "C" && consEnerg != "D" && consEnerg != "E"
				&& consEnerg != "F") {
			throw new IllegalArgumentException("El consumo Energético ha de ser: A, B, C, D, E o F");
		}
		this.precioBase = precioBase;
		this.color = color;
		this.consEnerg = consEnerg;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public Color getColor() {
		return color;
	}

	public String getConsEnerg() {
		return consEnerg;
	}

	public int getPeso() {
		return peso;
	}

	public double precioFinal() {
		double aumentoPrecioCons=0;
		double aumentoPrecioPeso=0;
		if (this.consEnerg.contentEquals("A")) {
			aumentoPrecioCons = (precioBase * 0.3);
		} else if (this.consEnerg.contentEquals("B")) {
			aumentoPrecioCons = (precioBase * 0.25);
		} else if (this.consEnerg.contentEquals("C")) {
			aumentoPrecioCons = (precioBase * 0.2);
		} else if (this.consEnerg.contentEquals("D")) {
			aumentoPrecioCons = (precioBase * 0.15);
		} else if (this.consEnerg.contentEquals("E")) {
			aumentoPrecioCons = (precioBase * 0.10);
		} else if (this.consEnerg.contentEquals("F")) {
			aumentoPrecioCons = (precioBase * 0.05);
		}

		if (this.peso > 0 && this.peso < 19) {
			aumentoPrecioPeso = (precioBase * 0.05);
		} else if (this.peso >= 20 && this.peso < 49) {
			aumentoPrecioPeso = (precioBase * 0.1);
		} else if (this.peso >= 50 && this.peso < 79) {
			aumentoPrecioPeso = (precioBase * 0.15);
		} else if (this.peso >= 80) {
			aumentoPrecioPeso = (precioBase * 0.2);
		}

		return this.precioBase + aumentoPrecioCons + aumentoPrecioPeso;
	}

	@Override
	public String toString() {
		return "Color: " + color + ", Consumo Energético: " + consEnerg
				+ ", Peso: " + peso + ", Precio Base: "+ precioBase;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getClass().getSimpleName(), color, consEnerg, peso, precioFinal());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electrodomestico other = (Electrodomestico) obj;
		return getClass().getSimpleName().contentEquals(obj.getClass().getSimpleName()) && color.equals(other.color)
				&& consEnerg.equals(other.consEnerg) && peso == other.peso && precioFinal() == other.precioFinal();
	}

	@Override
	public final int compareTo(Electrodomestico obj) {
		Electrodomestico elec = (Electrodomestico) obj;
		int result = elec.getClass().toString().compareTo(getClass().toString());
		if (result == 0) {
			result = consEnerg.compareTo(elec.consEnerg);
			if (result == 0) {
				result = color.compareTo(elec.color);
				if (result == 0) {
					if (precioFinal() < (elec.precioFinal()))
						result = -1;
					else if (precioFinal() > elec.precioFinal())
						result = 1;
					else
						result = 0;
				}
			}
		}
		return result;
	}

}
