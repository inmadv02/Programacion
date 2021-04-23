package ejercicio05;

public class EmpleadoFijo extends Empleado{
	
	private double impuestos;

	public EmpleadoFijo(String nombre, double sueldoBase, int id, double impuestos) {
		super(nombre, sueldoBase, id);
		this.impuestos = impuestos;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "EmpleadoFijo [impuestos=" + impuestos + "]";
	}
	
	public double calcularSueldo (double porcentaje, int ventasRealizadas) {
		int cien = 100;
		return getSueldoBase() - (impuestos - impuestos * porcentaje/cien);
		
	}

}
