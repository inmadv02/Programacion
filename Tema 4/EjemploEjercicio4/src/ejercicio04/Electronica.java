package ejercicio04;

public class Electronica extends Producto{
	
	private boolean seguro;

	public Electronica(String nombre, double precioBase, double pvp, boolean seguro) {
		super(nombre, precioBase, pvp);
		this.seguro = seguro;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Electronica [seguro=" + seguro + "]";
	}

	@Override
	public double calcularPvp(double descuento, int topeDias) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
