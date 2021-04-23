package ejercicio;

public class Trastero implements Comparable <Trastero> {
	
	private double capacidad;
	private String direccion;
	private int id;
	private double precio;
	private boolean ocupado;

	public Trastero(double capacidad, String direccion, int id, double precio, boolean ocupado) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.id = id;
		this.precio = precio;
		this.ocupado = ocupado;
	}
	
	public Trastero () {
		
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [capacidad=" + capacidad + ", direccion=" + direccion + ", id=" + id + ", precio=" + precio
				+ ", ocupado=" + ocupado + "]";
	}

	public int compareTo(Trastero t) {
		
		int negativo = -1, positivo = 1, cero = 0;
		
		if (t.id < t.getId()) {
			return negativo;
		}
		
		if(t.id > t.getId()) {
			return positivo;
		}
		
		else {
			return cero;
		}
	}

}
