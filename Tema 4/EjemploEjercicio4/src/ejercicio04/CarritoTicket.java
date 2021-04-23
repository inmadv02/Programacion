package ejercicio04;

import java.util.Arrays;

public class CarritoTicket {
	
	private LineaVenta [] lista;

	public CarritoTicket(LineaVenta[] lista) {
		super();
		this.lista = lista;
	}
	
	public CarritoTicket() {
		lista = new LineaVenta[20];
	}

	public LineaVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaVenta[] lista) {
		this.lista = lista;
	}

	
	public String toString() {
		return "CarritoTicket [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularTotal(double descuento, int topeDias) {
		
		double resultado = 0.0;
		
		for (int i = 0; i < lista.length; i++) {
			resultado = resultado + lista[i].calcularSubtotal(descuento, topeDias);
		}
		
		return resultado;

	}

}
