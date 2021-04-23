package ejercicio05;

public class Empleado {
	
	private String nombre;
	private double sueldoBase;
	private int id;
	
	public Empleado(String nombre, double sueldoBase, int id) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", id=" + id + "]";
	}
	
	public double calcularSueldo (double porcentaje, int ventasRealizadas) {
		return sueldoBase;
		
	}
	

}
