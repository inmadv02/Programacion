package ejercicio04;

public abstract class Producto { 
	
	//Sabemos que es abstracta porque no vamos a tener que instanciar objetos 
	//de este tipo. Tampoco nos dicen cómo vamos a tener que calcular algo en un método
	
	private String nombre;
	private double precioBase;
	private double pvp;
	
	public Producto(String nombre, double precioBase, double pvp) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.pvp = pvp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", pvp=" + pvp + "]";
	}
	
	public abstract double calcularPvp(double descuento, int topeDias);
	

}
