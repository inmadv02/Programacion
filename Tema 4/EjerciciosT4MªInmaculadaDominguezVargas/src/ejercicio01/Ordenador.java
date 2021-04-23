package ejercicio01;

public class Ordenador {
	
	public double capacidadDiscoDuro;
	public double precioBase;
	public double frecuenciaProcesador;
	
	public Ordenador(double capacidadDiscoDuro, double precioBase, double frecuenciaProcesador) {
		super();
		this.capacidadDiscoDuro = capacidadDiscoDuro;
		this.precioBase = precioBase;
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getCapacidadDiscoDuro() {
		return capacidadDiscoDuro;
	}

	public void setCapacidadDiscoDuro(double capacidadDiscoDuro) {
		this.capacidadDiscoDuro = capacidadDiscoDuro;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDiscoDuro=" + capacidadDiscoDuro + ", precioBase=" + precioBase
				+ ", frecuenciaProcesador=" + frecuenciaProcesador + "]";
	}
	
	public double calcularPrecioVenta (double ganancia, int cien) {
		return precioBase - (precioBase * (ganancia/cien));
	}

}
