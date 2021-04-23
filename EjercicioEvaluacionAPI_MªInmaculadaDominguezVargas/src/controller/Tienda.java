package controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Producto;

public class Tienda {
	
	public double calcularPrecio (Producto p, double descuento, int cien, double plus, double porcentaje) {				
		return p.calcularPrecio(descuento, cien, plus, porcentaje);
		
	}
	
	public double calcularTotal (List <Producto> lista, Producto p, double descuento, int cien, double plus, double porcentaje) {
		double subtotal = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			subtotal+= calcularPrecio(p, descuento, cien, plus, porcentaje);
		}
		
		return subtotal;
	}
	
	public void aumentarPrecio (List <Producto> lista, double subida){
		lista.stream()
		.map(p -> p.getPrecio())
		.map(p -> p + (p*subida/100)).forEach(p -> System.out.println(p));
		
		
	}
	
	public void rebajarProductos (List <Producto> lista, double bajada, LocalDate fechaRebaja) {
		long diferencia;
		double rebaja = 0.0;
		for (int i = 0; i < lista.size(); i++) {
			diferencia = lista.get(i).getEntrada().until(fechaRebaja, ChronoUnit.MONTHS);
			if(diferencia >= 5) {
				rebaja = lista.get(i).getPrecio() - (lista.get(i).getPrecio()*bajada/100);
				lista.get(i).setPrecio(rebaja);
				System.out.println(lista.get(i));
			}
			
		}
		
		
	}

}
