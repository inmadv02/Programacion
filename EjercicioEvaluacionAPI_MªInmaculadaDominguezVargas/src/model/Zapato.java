package model;

import java.time.LocalDate;

public class Zapato extends Producto {
	
	private int numero;
	private String material;
	
	

	public Zapato(int id, String nombre, double precio, String descripcion, LocalDate entrada, int numero,
			String material) {
		super(id, nombre, precio, descripcion, entrada);
		this.numero = numero;
		this.material = material;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}

	
	@Override
	public String toString() {
		return "\nZapato\nid:" + getId() + "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio() + "\nDescripción: "
				+ getDescripcion() +"\nFecha de entrada: " + getEntrada() + "\nNúmero: " + numero + "\nMaterial: " + material;
	}

	public double calcularPrecio (double descuento, int cien, double plus, double porcentaje) {
		String piel = "Piel";
		if (material.equalsIgnoreCase(piel)) {
			return super.calcularPrecio(descuento, cien, plus, porcentaje) + getPrecio() * porcentaje;
		}
		else {
			return super.calcularPrecio(descuento, cien, plus, porcentaje);
		}
	}
	
	

}
