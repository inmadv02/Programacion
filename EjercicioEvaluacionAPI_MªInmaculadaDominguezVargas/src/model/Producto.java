package model;

import java.time.LocalDate;

public class Producto implements Comparable <Producto>{
	
	private int id;
	private String nombre;
	private double precio;
	private String descripcion;
	private LocalDate entrada;
	
	
	public Producto(int id, String nombre, double precio, String descripcion, LocalDate entrada) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.entrada = entrada;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public LocalDate getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDate entrada) {
		this.entrada = entrada;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion
				+ "]";
	}

	
	//metodo calcular precio
	
	public double calcularPrecio (double descuento, int cien, double plus, double porcentaje) {
		return precio - (precio * (descuento/cien));
	}
	
	public int compareTo(Producto p) {
		if(this.id < p.getId()) {
			return -1;
		}
		if(this.id > p.getId()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
