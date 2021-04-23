package ejercicio03;

public class Furgo extends Vehiculo{
	
	private double carga;

	public Furgo(double cilindrada, double caballos, String tipoCombustible, double carga) {
		super(cilindrada, caballos, tipoCombustible);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Furgo [carga=" + carga + "]";
	}
	
	
	public double calcularImpuestoCirculacion (double cantidadFija, double plusFurgoneta) {
		return cantidadFija + plusFurgoneta;
	}
	
	
	
	

}
