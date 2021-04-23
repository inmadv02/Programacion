package ejercicio04;

public class LineaVenta {
	
	private int cantidad;
	private Producto p;
	//double pvp;
	//double subtotal;
	
	public LineaVenta(int cantidad, Producto p) {
		super();
		this.cantidad = cantidad;
		this.p = p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "LineaVenta [cantidad=" + cantidad + ", p=" + p + "]";
	}
	
	public double calcularSubtotal(double descuento, int topeDias) {
		
		return cantidad * p.calcularPvp(descuento, topeDias);
		
	}
	
	

}
