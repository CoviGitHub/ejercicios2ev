package unidad5;

import java.util.ArrayList;

public class Libro {
	private String titulo;
	private ArrayList<Autor> autores;
	private float precio;
	private int stock;
	
	public Libro(String titulo,ArrayList<Autor> autores,float precio) {
		this(titulo,autores,precio,0);
	}
	
	public Libro(String titulo, ArrayList<Autor> autores, float precio, int stock) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.stock = stock;
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder(titulo);
		s.append(" (");
		for (Autor a: autores) {
			s.append(a.getNombre());
			s.append(", ");
		}
		s.setLength(s.length()-2);
		s.append(") ");
		s.append(precio);
		s.append("� - ");
		s.append(stock);
		s.append(" unidades en stock");
		return s.toString();
	}
	
}
