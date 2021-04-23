package ejercicio;

public class Profesor {
	
	String nombre;
	String apellido;
	int id_profesor;
	double sueldoB;
	int horas;
	
	public Profesor (String nombre, String apellido, int id_profesor, int horas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_profesor = id_profesor;
		this.horas = horas;
		
	}
	
	public String toString() {
		return "Profesor\n"
				+ "Nombre: " + nombre + "\nApellido: " + apellido + "\nid_profesor: " + id_profesor + 
				"\nHoras: " + horas + "";
	}
	
	public double calcularSB (int horas, double pago) {
		sueldoB = horas * pago;
		return sueldoB;
		
	}
	
	public double calcularSN (double porcentaje) {
		double sueldoN;
		int cien = 100;
		
		sueldoN = sueldoB - ((sueldoB*porcentaje)/cien);
		return sueldoN;
	}
	
	public void comprobar () {
		double tope = 1500.00;
		if (sueldoB > tope) {
			System.out.println("Este mes comemos jamón.");
		}else {
			System.out.println("Este mes comemos choped.");
		}
	}
	public int gethorasN (int horasN) {
		return horasN;
	}

}
