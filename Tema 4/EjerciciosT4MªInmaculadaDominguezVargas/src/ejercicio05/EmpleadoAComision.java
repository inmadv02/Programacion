package ejercicio05;

public class EmpleadoAComision extends Empleado{
	
	private double incentivo;

	public EmpleadoAComision(String nombre, double sueldoBase, int id, double incentivo) {
		super(nombre, sueldoBase, id);
		this.incentivo = incentivo;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "EmpleadoAComision [incentivo=" + incentivo + "]";
	}
	
	public double calcularSueldo (double porcentaje, int ventasRealizadas) {
		return getSueldoBase() + (ventasRealizadas * incentivo/100);
		
	}
	
	public void imprimirMensaje (double porcentaje, int ventasRealizadas) {
		
		double minimo = 500;
		
		if (calcularSueldo (porcentaje, ventasRealizadas) > minimo) {
			System.out.println("¡Felicidades! Has ganado más de 500 euros.");
		}
		
	}

}
