package ejercicio01;

public class Tablet extends Ordenador{
	
	private double seguroPantalla;

	public Tablet(double capacidadDiscoDuro, double precioBase, 
				  double frecuenciaProcesador, double seguroPantalla) {
		
		super(capacidadDiscoDuro, precioBase, frecuenciaProcesador);
		this.seguroPantalla = seguroPantalla;
		
	}
	
	public double calcularPrecioVenta (double ganancia, int cien) {
		return seguroPantalla + precioBase - (precioBase * (ganancia/cien));
		
	}
	
	

}
