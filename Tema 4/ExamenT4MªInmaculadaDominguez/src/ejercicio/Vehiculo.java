package ejercicio;

public class Vehiculo {
	
	private String matricula;
	private int numPlazas;
	private int numOcupantes;
	
	public Vehiculo(String matricula, int numPlazas, int numOcupantes) {
		super();
		this.matricula = matricula;
		this.numPlazas = numPlazas;
		this.numOcupantes = numOcupantes;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	@Override
	public String toString() {
		return "\nVehiculo \nMatricula: " + matricula + "\nnº plazas: " + numPlazas + "\nnº ocupantes: " + numOcupantes;
	}
	
	public double calcularPrecio (double cantidadFija, double descuento, double cantidadPatinete) {
		return numPlazas * cantidadFija;
	}

}
