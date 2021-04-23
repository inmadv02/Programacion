package ejercicio;

public class Patinete extends Vehiculo{
	
	private double potencia;

	public Patinete(String matricula, int numPlazas, int numOcupantes, double potencia) {
		super(matricula, numPlazas, numOcupantes);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	
	@Override
	public String toString() {
		return "\nPatinete \nPotencia: " + potencia +  "\nnº plazas: " + getNumPlazas() + "\nnº ocupantes: " + getNumOcupantes();
	}

	public double calcularPrecio (double cantidadFija, double descuento, double cantidadPatinete) {
		double maximo = 90.0;
		if (potencia > maximo) {
			return super.calcularPrecio(cantidadFija, descuento, cantidadPatinete) + cantidadPatinete;
		}
		else {
			return super.calcularPrecio(cantidadFija, descuento, cantidadPatinete);
		}
	}
	
	public void avisarPatinete () {
		double maximo = 90.0;
		if (potencia > maximo) {
			System.out.println("¡Cuidado, patinete tuneado!");
		}
	}

}
