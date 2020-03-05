package unidad5;

import java.time.LocalDate;

public class Animal {
	private String nombre;
	private LocalDate fecha;
	private int edad;

	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Animal(String nombre) {
		this.nombre = nombre;
		this.fecha = LocalDate.now();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getEdad() {
		int edad = LocalDate.now().getYear() - fecha.getYear();
		return edad;
	}

	@Override
	public String toString() {
		return String.format("Nombre: " + nombre + " - Edad: " + edad);
	}

}
