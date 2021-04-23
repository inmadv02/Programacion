package ejercicio03;

public class Moto extends Vehiculo{
	
	private String marca;

	public Moto(double cilindrada, double caballos, String tipoCombustible, String marca) {
		super(cilindrada, caballos, tipoCombustible);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + "]";
	}
	
	public double calcularImpuestoCirculacion (double cantidadFija, double porcentajePotencia) {
		int cien = 100;
		return cantidadFija + (caballos * porcentajePotencia/cien);
	}

}
