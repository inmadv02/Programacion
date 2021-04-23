package ejercicioTE2;

import java.util.Arrays;

public class Venta {
	
	private Producto [] lista;
	
	public Venta(Producto[] lista) {
		super();
		this.lista = lista;
	}
	
	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}

	public void devolverNoVendidos () {
		
		double productosNoVendidos = 0.0;
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i].isActivo() == true) {
				productosNoVendidos = productosNoVendidos + lista[i].getCantidadUnidades();	
			}
		}
		System.out.println("La cantidad de productos no vendidos es de: " + productosNoVendidos);
	}
	
	public void calcularIngresos (double porcentaje, double cantidadFija) {
		
		double totalIngresos = 0.0;
		
		for (int i = 0; i < lista.length; i++) {
			
			if(lista[i].isActivo() == false) { //corregir
				totalIngresos += calcularPVP(lista[i]);
			}
		}
		
	}

}
