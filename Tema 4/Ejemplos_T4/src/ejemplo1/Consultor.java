package ejemplo1;

public class Consultor extends Trabajador{
	
	private int horas;
	private double tarifa;
	
	
	public Consultor(String nombre, String puesto, int horas, double tarifa) {
		super(nombre, puesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}


	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", getNombre()=" + getNombre() + ", getPuesto()="
				+ getPuesto() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	public double calcularPaga () {
		return (horas*tarifa);
	}
}
