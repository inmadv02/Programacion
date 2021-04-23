package ejercicio;

public class Profesor {
	
	String nombre; //A los atributos no se les asigna valor inicial
	String apellido;
	int id;
	double sueldoB;
	int horas;
	
	public Profesor (String nombre, String apellido, int id, double sueldoB, int horas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.sueldoB = sueldoB;
		this.horas = horas;
	}
	
	public Profesor (String nombre, String apellido, int id, int horas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.horas = horas;
	}
	
	
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horasN) {
		this.horas = horasN;
	}

	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", horas=" + horas + "]";
	}
	
	public double calcularSB (double costeHoras) {
		sueldoB = horas*costeHoras;
		return sueldoB;
	}
	
	public double calcularSN (double porcentaje) {
		double denominador = 100;
		double sueldoN;
		sueldoN = sueldoB -((sueldoB*porcentaje)/denominador);
		return sueldoN;
		
	}
	public void comprobarSueldo () {
		double tope = 1500.00;
		if (sueldoB > tope) {
			System.out.println("Este mes comemos jamón.");
		}
		else {
			System.out.println("Este mes comemos choped.");
		}
	}
	
	public void cambiarHoras (int horasN) {
		//horas = horasN;
		setHoras(horasN);

	}
	
	
}
