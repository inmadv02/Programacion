package ejemplo03;

import java.util.Random;

public class Producto {
	
	private String nombre;
	private double precio;
	private int cantidad;
	
	public Producto (String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto"
				+ "\n_________"
				+ "\nNombre =" + nombre + "\nPrecio = " + precio + "\nCantidad =" + cantidad;
	}
	
	public double calcularPrecioFinal (int [] listadoDescuentos) {
		double precioFinal = precio;
		
		for (int i = 0; i < listadoDescuentos.length; i++) {
			precioFinal = precioFinal - listadoDescuentos[i];
			
		}
		return precioFinal*cantidad; //Esto del atributio no se hace siempre, es solo por ser un ejemplo. 
	}
	
	public int [] cargarArrayAle (int hasta, int desde, int tam) {
		int [] listadoDescuentos = new int [tam];
		Random ale = new Random (System.nanoTime());
		
		for (int i = 0; i < listadoDescuentos.length; i++) {
			listadoDescuentos [i] = ale.nextInt(hasta-desde+1)+desde;
		}
		return listadoDescuentos;
		
	}
	
	public void mostrarArray (int [] listaCargada) {
		for (int i = 0; i < listaCargada.length; i++) {
			System.out.println(listaCargada [i]);
		}
	}
	
}
