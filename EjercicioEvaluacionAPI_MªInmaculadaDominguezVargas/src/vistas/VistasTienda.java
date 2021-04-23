package vistas;


import java.util.List;

import crud.CRUDProducto;
import model.Camiseta;
import model.Producto;
import model.Zapato;

public class VistasTienda {
	
	private CRUDProducto cp;

	public VistasTienda(CRUDProducto cp) {
		super();
		this.cp = cp;
	}

	public void mostrarProductos (List <Producto> lista) {
		for(Producto p: lista) {
			System.out.println(p);
		}
		
	}
	
	public void mostrarCamisetas (List <Producto> lista) {
		lista.stream().filter(p -> p instanceof Camiseta)
		.map(p -> ((Camiseta) p)).forEach(p -> System.out.println(p));
		
	}
	
	public void mostrarZapatos (List <Producto> lista) {
		lista.stream().filter(p -> p instanceof Zapato)
		.map(p -> ((Zapato) p)).forEach(p -> System.out.println(p));
	}
	
	public void mostrarOrdenadosPorId() {
		cp.ordenarPorId();
		
		cp.getLista().stream().forEach(p -> System.out.println(p));
	}
	public void mostrarOrdenadosPorPrecio() {
		cp.ordenarPorPrecio();
		
		cp.getLista().stream().forEach(p -> System.out.println(p));
	}
	
		
	
	

}
