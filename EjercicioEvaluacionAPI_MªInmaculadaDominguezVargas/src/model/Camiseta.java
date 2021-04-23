package model;

import java.time.LocalDate;

public class Camiseta extends Producto {
	
	private String talla;
	private String color;
	private String estampado;
	
	public Camiseta(int id, String nombre, double precio, String descripcion, LocalDate entrada, String talla,
			String color, String estampado) {
		super(id, nombre, precio, descripcion, entrada);
		this.talla = talla;
		this.color = color;
		this.estampado = estampado;
	}

	
	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getEstampado() {
		return estampado;
	}


	public void setEstampado(String estampado) {
		this.estampado = estampado;
	}


	public String toString() {
		return "\nCamiseta\nid:" + getId() + "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nDescripción: "
				+ getDescripcion() +"\nFecha de entrada: " + getEntrada() + "\nTalla: " + talla + "\nColor: " + color + "\nEstampado: " + estampado;
	}


	public double calcularPrecio (double descuento, int cien, double plus, double porcentaje) {
		if(this.estampado != null) {
			return super.calcularPrecio(descuento, cien, plus, porcentaje) + plus;
		}
		return super.calcularPrecio(descuento, cien, plus, porcentaje);
	}
	
	
	

}
