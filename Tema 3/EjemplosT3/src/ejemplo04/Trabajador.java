package ejemplo04;

import java.util.Arrays;

public class Trabajador {
	
	private String nombre;
	private double [] horasTrabajadas;
	private double precioHora;
	
	public Trabajador (String nombre, double [] horasTrabajadas, double precioHora) {
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double[] horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	
	public double calcularSueldo () {
		double sumHoras = 0.0;
		for (int i = 0; i < horasTrabajadas.length; i++) {
			sumHoras = sumHoras + horasTrabajadas[i];
		}
		return sumHoras*precioHora;
	}
	
	public double calcularSNeto (double porc) {
		double sueldoNeto, sueldoBruto, den = 100;
		sueldoBruto = calcularSueldo();
		sueldoNeto = sueldoBruto - sueldoBruto*porc/den;
		return sueldoNeto;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", horasTrabajadas=" + Arrays.toString(horasTrabajadas)
				+ ", precioHora=" + precioHora + "]";
	}
	
	
}
