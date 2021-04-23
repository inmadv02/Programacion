package ejercicioTE2;

public class Movil extends Producto {
	
	private String marca;
	private String modelo;
	

	public Movil(double precioBase, int cantidadUnidades, String nombre, boolean activo, String marca, String modelo) {
		super(precioBase, cantidadUnidades, nombre, activo);
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public double calcularPVP (double porcentaje, double cantidadFija) {
		setActivo(false);
		return getPrecioBase() + (getPrecioBase() * porcentaje/100);
	}
	
	

}
