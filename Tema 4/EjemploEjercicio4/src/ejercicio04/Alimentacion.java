package ejercicio04;

public class Alimentacion extends Producto {
	
	private int diasParaCaducidad;
	private boolean fresco;
	
	
	public Alimentacion(String nombre, double precioBase, double pvp, int diasParaCaducidad, boolean fresco) {
		super(nombre, precioBase, pvp);
		this.diasParaCaducidad = diasParaCaducidad;
		this.fresco = fresco;
	}


	public int getDiasParaCaducidad() {
		return diasParaCaducidad;
	}


	public void setDiasParaCaducidad(int diasParaCaducidad) {
		this.diasParaCaducidad = diasParaCaducidad;
	}


	public boolean isFresco() {
		return fresco;
	}


	public void setFresco(boolean fresco) {
		this.fresco = fresco;
	}


	@Override
	public String toString() {
		return "Alimentacion [diasParaCaducidad=" + diasParaCaducidad + ", fresco=" + fresco + "]";
	}
	
	//Para calcular el precio de venta al público de Alimentación, se calcula de la siguiente
	//manera:
	
	public double calcularPvp(double descuento, int topeDias) {
		
		double denominador = 100;
		
		if (diasParaCaducidad <= topeDias) {
			return getPvp()-getPvp()*descuento/denominador;
		}else {
			return getPvp();
			
		}
	}

}
