package repaso2ev;

import java.text.DecimalFormat;

public class Automovil {

	private String modelo = ""; // Modelo
	private float capacDepo = 0; // Capacidad dde combustible en el deposito en litros
	private float combustDepo = 0; // Cantidad de combustible en el deposito en litros
	private float consumLKm = 0; // Consumo por kilómetros recorridos
	private float totalKm = 0; // Cantidad total de kilómetros recorridos
	private float totalConsum = 0; // Cantidad total de combustible consumido
	private boolean viaje=false;

	public Automovil(String modelo, int capacDepo, int combustDepo, double consumLKm) {
		this.modelo = modelo;
		this.capacDepo = (float) capacDepo;
		this.combustDepo = (float) combustDepo;
		this.consumLKm = (float) consumLKm;
		this.totalKm = 0;
		this.totalConsum = 0;
	}

	public Automovil(String modelo, int capacDepo, double consumLKm) {
		this.modelo = modelo;
		this.capacDepo = (float) capacDepo;
		this.combustDepo = capacDepo;
		this.consumLKm = (float) consumLKm;
		this.totalKm = 0;
		this.totalConsum = 0;
	}

	public String getModelo() {
		return modelo;
	}

	public float getCapacDepo() {
		return capacDepo;
	}

	public float getCombustDepo() {
		return combustDepo;
	}

	public float getConsumLKm() {
		return consumLKm;
	}

	public float getTotalKm() {
		return totalKm;
	}

	public float getTotalConsum() {
		return totalConsum;
	}
	
	public boolean isViaje() {
		return viaje;
	}

	public void llenarDeposito() {
		this.combustDepo = capacDepo;
	}

	public float llenarDeposito(double llenado) {
		float sobrante = 0;
		if (combustDepo + (float) llenado <= capacDepo) {
			combustDepo = combustDepo + (float) llenado;
		} else {
			sobrante = ((float) llenado + combustDepo) - capacDepo;
			combustDepo = capacDepo;
		}
		return sobrante;
	}

	public void desplazarse(int km) {
		if ((km * consumLKm) <= combustDepo) {
			combustDepo = combustDepo - (km * consumLKm);
			totalKm += km;
			totalConsum += (km * consumLKm);
			viaje=true;
		}else viaje= false;
	}

	@Override
	public String toString() {
		DecimalFormat dosD=new DecimalFormat("0.00");
		return dosD.format(combustDepo) + " " + Math.round(totalKm) + " " + dosD.format(totalConsum)+ "\n";
	}
}

