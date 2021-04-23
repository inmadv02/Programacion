package ejercicio;

public class Batmovil extends Vehiculo{
	
	private int numRuedas;

	public Batmovil(String matricula, int numPlazas, int numOcupantes, int numRuedas) {
		super(matricula, numPlazas, numOcupantes);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return "\nBatmovil \nnº ruedas: " + numRuedas + "\nMatricula: " + getMatricula() + "\nnº plazas: "
				+ getNumPlazas() + "\nnº ocupantes: " + getNumOcupantes();
	}
	
	public double calcularPrecio (double cantidadFija, double descuento, double cantidadPatinete) {
		int divisor = 100;
		if (getNumOcupantes() < getNumPlazas()) {
		return super.calcularPrecio(cantidadFija, descuento, cantidadPatinete) -
				  (super.calcularPrecio(cantidadFija, descuento, cantidadPatinete) * descuento/divisor);
		
		}else {
			return super.calcularPrecio(cantidadFija, descuento, cantidadPatinete);
		}
		
	}

	
	
	

}
