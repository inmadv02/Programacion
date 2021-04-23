package ejercicioTE2;

public abstract class Producto {
	
	private double precioBase;
	private int cantidadUnidades;
	private String nombre;
	private boolean activo;
	
	public Producto(double precioBase, int cantidadUnidades, String nombre, boolean activo) {
		super();
		this.precioBase = precioBase;
		this.cantidadUnidades = cantidadUnidades;
		this.nombre = nombre;
		this.activo = activo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidadUnidades=" + cantidadUnidades + ", nombre=" + nombre
				+ "]";
	}
	
	public abstract double calcularPVP (double porcentaje, double cantidadFija);
	

}
