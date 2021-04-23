package crud;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import model.Camiseta;
import model.Producto;
import model.Zapato;

public class CRUDProducto {
	
	private List <Producto> lista;
	
	
	public CRUDProducto(List<Producto> lista) {
		super();
		this.lista = lista;
	}
	

	public List<Producto> getLista() {
		return lista;
	}

	public void setLista(List<Producto> lista) {
		this.lista = lista;
	}



	public Function <Producto, Boolean> agregarProducto = p -> lista.add(p);
	
	public Function <Producto, Boolean> eliminarProducto = p -> lista.remove(p);
	
	public Function <Integer, Producto> buscarPorId = index -> lista.get(index-1);
	
	
	public List <Producto> buscarCamisetas () {
		return lista.stream().filter(p -> p instanceof Camiseta)
				.map(p -> ((Camiseta) p))
				.collect(Collectors.toList());
				
	}
	
	public List <Producto> buscarZapatos () {
		return lista.stream().filter(p -> p instanceof Zapato)
				.map(p -> ((Zapato) p))
				.collect(Collectors.toList());
	}
	
	
	public void filtrarPorColores(String color) {
		buscarCamisetas().stream().filter(c -> ((Camiseta) c).getColor().equals(color))
		.forEach(c -> System.out.println(c));
	}
	
	public void filtrarPorEstampado(String estampado) {
		buscarCamisetas().stream().filter(c -> ((Camiseta) c).getEstampado().equals(estampado))
		.forEach(c -> System.out.println(c));
	}
	
	public void filtrarPorNumero(int numero) {
		buscarZapatos().stream()
		.filter(z -> ((Zapato) z).getNumero()==numero)
		.forEach(z -> System.out.println(z));
	}
	
	public void filtrarPorNombreYPrecio(double precio, String nombre) {
		
		Predicate <Producto> producto = p -> p.getNombre().equalsIgnoreCase(nombre);
		Predicate <Producto> producto2 = p -> p.getPrecio() == precio;
		
		Predicate <Producto> igual = producto.and(producto2);
		
		lista.stream().allMatch(igual);
		
	}
	
	
	public class compararPorPrecio implements Comparator<Producto>{
		public int compare(Producto p, Producto p2) {
			double precio1 = p.getPrecio();
			double precio2 = p2.getPrecio();
			
			if (precio1 < precio2) {
				return -1;
			}
			if (precio1 > precio2) {
				return 1;
			}
			else {
				return 0;
			}
		}
	};
	
	public void ordenarPorId() {
		lista.stream().sorted();
		
	}
	
	public void ordenarPorPrecio() {
		lista.stream()
		.sorted(new compararPorPrecio());
		
	}
	
	public LocalDate transformarFecha (String fechaNueva) {
		LocalDate fechaEntrada = LocalDate.parse(fechaNueva);
		return fechaEntrada;
	}
}
