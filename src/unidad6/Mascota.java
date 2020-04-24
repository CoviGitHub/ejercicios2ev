package unidad6;

public class Mascota {

	private String nombre;
	private int energia = 0;

	public Mascota(String nombre) {
		this.nombre = nombre;
		this.energia = 20;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEnergia() {
		return this.energia;
	}

	public void comer() {
		if (this.energia <= 5 || this.energia >= 50)
			this.energia--;
		else if ((int) (Math.random() * 9) < 3)
			this.energia -= 10;
		else
			this.energia += 5;
	}

	public void dormir() {
		if (this.energia < 5 || this.energia > 50)
			this.energia--;
		else
			this.energia += 2;
	}

	public void ejercicio() {
		if (this.energia < 5 || this.energia > 50)
			this.energia--;
		else
			this.energia -= 3;
	}

	private String estado() {
		String onomatopeya = "";
		if (this.energia > 50 || this.energia < 5) {
			onomatopeya = "¡aaayyy!";
		} else if ((this.energia > 47 && this.energia <= 50) || (this.energia < 8 && this.energia >= 5)) {
			onomatopeya = "bah pff";
		} else {
			onomatopeya = "rrr rrr rrr";
		}
		return onomatopeya;
	}

	public String curar() {
		if (this.energia > 50 || this.energia < 5) {
			this.energia = 20;
			return "";
		} else
			return this.nombre + " no necesita cura ";
	}

	public boolean estaVivo() {
		if (this.energia < 0 || this.energia > 53) {// fallecería a partir de 53 no con 55 ni 54
			return false;
		} else
			return true;
	}

	@Override
	public String toString() {
		String estado = estado();
		return estado;
	}
}
