package ejercicio01;

public class Portatil extends Ordenador{
	
	private double descuento;

	public Portatil(double capacidadDiscoDuro, double precioBase, 
			        double frecuenciaProcesador, double descuento) {
		
		super(capacidadDiscoDuro, precioBase, frecuenciaProcesador);
		this.descuento = descuento;
		
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Portatil [descuento=" + descuento + "]";
	}
	
	public double calcularPrecioVenta (double ganancia, int cien) {
		return precioBase - (precioBase * (ganancia/cien)) - (precioBase * (descuento/cien));
		
	}
	

}
