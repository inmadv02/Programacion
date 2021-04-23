package ejercicio03;

public class Coche extends Vehiculo {
	
	private String color;

	public Coche(double cilindrada, double caballos, 
		   String tipoCombustible, String color) {
		
		super(cilindrada, caballos, tipoCombustible);
		this.color = color;
		
	}

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double calcularImpuestoCirculacion (double cantidadFija, double porcentajeCilindrada) {
		int cien = 100;
		return cantidadFija + (cilindrada * porcentajeCilindrada/cien);
	}

}
